/* Copyright (c) 2011-2013 GoPivotal, Inc. All Rights Reserved. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under the
 * License. */
package com.xx.scope.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;


/**
 * @author From: https://github.com/twitter/snowflake An object that generates
 *         IDs. This is broken into a separate class in case we ever want to
 *         support multiple worker threads per process
 * 
 * 
 *         分布式系统中，有一些需要使用全局唯一ID的场景，这种时候为了防止ID冲突可以使用36位的UUID，但是UUID有一些缺点，首先他相对比较长
 *         ，另外UUID一般是无序的。 有些时候我们希望能使用一种简单一些的ID，并且希望ID能够按照时间有序生成。
 *         而twitter的snowflake解决了这种需求，最初Twitter把存储系统从MySQL迁移到Cassandra，
 *         因为Cassandra没有顺序ID生成机制，所以开发了这样一套全局唯一ID生成服务。
 * 
 *         snowflake的结构如下(每部分用-分开): 0 - 0000000000 0000000000 0000000000
 *         0000000000 0 - 00000 - 00000 - 000000000000
 * 
 *         第一位为未使用，接下来的41位为毫秒级时间(41位的长度可以使用69年)，然后是5位datacenterId和5位workerId(
 *         10位的长度最多支持部署1024个节点） ，最后12位是毫秒内的计数（12位的计数顺序号支持每个节点每毫秒产生4096个ID序号）
 *         一共加起来刚好64位，为一个Long型。(转换成字符串长度为18)
 *         snowflake生成的ID整体上按照时间自增排序，并且整个分布式系统内不会产生ID碰撞（由datacenter和workerId作区分）
 *         ，并且效率较高。据说：snowflake每秒能够产生26万个ID。
 * 
 * 
 */
public class PrimaryKeyGenerator {
	private final static Logger logger = LoggerFactory.getLogger(PrimaryKeyGenerator.class);

	// 需要配置
	private long workerId;
	// 需要配置
	private long datacenterId;

	private long sequence = 0L;

	//时间起始标记点，作为基准，一般取系统第一次运行的的时间毫秒值作为"新纪元"
	private long twepoch = 1451577600000L;//2016-11-01 00:00:00

	// 机器标识位数
	private long workerIdBits = 5L;
	// 数据中心标识位数
	private long datacenterIdBits = 5L;
	// 机器ID最大值
	private long maxWorkerId = -1L ^ (-1L << workerIdBits);
	// 数据中心ID最大值
	private long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);
	// 毫秒内自增位
	private long sequenceBits = 12L;
	// 机器ID偏左移12位
	private long workerIdShift = sequenceBits;
	// 数据中心ID左移17位
	private long datacenterIdShift = sequenceBits + workerIdBits;
	// 时间毫秒左移22位
	private long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;
	private long sequenceMask = -1L ^ (-1L << sequenceBits);

	private long lastTimestamp = -1L;

	
	private PrimaryKeyGenerator() {}
	private static PrimaryKeyGenerator instance;

	public static PrimaryKeyGenerator getInstance() {
		if (instance == null) {
			synchronized (PrimaryKeyGenerator.class) {
				if (instance == null) {
					//这个需要从配置文件读取workerId和datacenterId值，目前1个数据中心节点和1个工作节点，配置的值都为1。
				 	//long workerId = Long.valueOf(Config.WORKER_ID);
                	//long datacenterId = Long.valueOf(Config.DATACENTER_ID);
					 long workerId = 1L;
					 long datacenterId = 1L;
					instance = new PrimaryKeyGenerator(workerId,datacenterId);
				}
			}
		}
		return instance;
	}

	
	

	private PrimaryKeyGenerator(long workerId, long datacenterId) {
		if (workerId > maxWorkerId || workerId < 0) {
			throw new IllegalArgumentException(
					String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
		}

		if (datacenterId > maxDatacenterId || datacenterId < 0) {
			throw new IllegalArgumentException(
					String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
		}

		this.workerId = workerId;
		this.datacenterId = datacenterId;
		logger.info(String.format(
				"worker starting. timestamp left shift %d, datacenter id bits %d, worker id bits %d, sequence bits %d, workerid %d",
				timestampLeftShift, datacenterIdBits, workerIdBits, sequenceBits, workerId));
	}
	

	public synchronized long nextId() {
		long timestamp = timeGen();

		// 时间错误
		if (timestamp < lastTimestamp) {
			logger.error(String.format("clock is moving backwards.  Rejecting requests until %d.", lastTimestamp));
			throw new RuntimeException(String.format(
					"Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
		}

		if (lastTimestamp == timestamp) {
			// 当前毫秒内，则+1
			sequence = (sequence + 1) & sequenceMask;
			if (sequence == 0) {
				// 当前毫秒内计数满了，则等待下一秒
				timestamp = tilNextMillis(lastTimestamp);
			}
		} else {
			sequence = 0L;
		}

		lastTimestamp = timestamp;
		// ID偏移组合生成最终的ID，并返回ID
		return ((timestamp - twepoch) << timestampLeftShift) | (datacenterId << datacenterIdShift)
				| (workerId << workerIdShift) | sequence;
	}

	// 等待下一个毫秒的到来
	protected long tilNextMillis(long lastTimestamp) {
		long timestamp = timeGen();
		while (timestamp <= lastTimestamp) {
			timestamp = timeGen();
		}
		return timestamp;
	}

	protected long timeGen() {
		return System.currentTimeMillis();
	}
	
	
	
	/**
	 * 测试使用
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            long primaryKey = PrimaryKeyGenerator.getInstance().nextId();
            if (set.contains(primaryKey)) {
                logger.error("有重复的!!!!!!!!!!!");
            } else {
                set.add(primaryKey);
            }
            
        }
        System.out.println("Elapsed time : " + (System.currentTimeMillis() - start));
        
       /* for (Long id : set) {
        	logger.info("id:"+id);
		}*/
        
    }
	
	
	
}
