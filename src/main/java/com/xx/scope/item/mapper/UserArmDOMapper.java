package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.UserArmDO;

public interface UserArmDOMapper {
    /**
     *
     * @mbggenerated 2019-11-14
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int insert(UserArmDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int insertSelective(UserArmDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    UserArmDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int updateByPrimaryKeySelective(UserArmDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int updateByPrimaryKey(UserArmDO record);
}