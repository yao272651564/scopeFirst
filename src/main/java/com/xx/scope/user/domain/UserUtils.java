package com.xx.scope.user.domain;

import com.xx.scope.common.exception.ServiceException;
import com.xx.scope.user.mapper.UserDOMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserUtils {

    private final static Logger logger = LoggerFactory.getLogger(UserUtils.class);
    
    /**
     * 通过用户ID获取对象,并验证用户ID是否合法
     */
    public static UserDO selectByPrimaryKey(UserDOMapper mapper, String id) {
    	 if (StringUtils.isEmpty(id)) {
             logger.error("用户ID为空,ID = " + id);
             throw new ServiceException("用户ID为空,无法查找到数据!");
         }
    	Long longId = null;
    	 try {
             longId =  Long.valueOf(id);
         } catch (Exception e) {
             throw new ServiceException("用户ID非法： " + id);
         }
        UserDO domain = mapper.selectByPrimaryKey(longId);
        if (domain == null) {
            logger.error("通过用户ID获取对象失败: id = " + id);
            throw new ServiceException("未找到数据,请检查用户ID是否正确!");
        }
        return domain;
    }


}
