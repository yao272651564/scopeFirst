package com.xx.scope.common.utils;

import com.xx.scope.common.exception.ServiceException;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

public class BeanUtil {
    private final static Logger logger = LoggerFactory.getLogger(BeanUtil.class);

    private BeanUtil(){}

    /**
     * 拷贝属性
     * @param dest 拷贝到的数据
     * @param orig 要拷贝的数据
     */
    public static void copyProperties(Object dest, Object orig) {
        try {
            BeanUtils.copyProperties(dest, orig);
        } catch (Exception e) {
            throw  new ServiceException("拷贝数据出错", e);
        }
    }

}
