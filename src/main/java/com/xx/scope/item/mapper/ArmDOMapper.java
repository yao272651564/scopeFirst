package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.ArmDO;

public interface ArmDOMapper {
    /**
     *
     * @mbggenerated 2019-11-14
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int insert(ArmDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int insertSelective(ArmDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    ArmDO selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int updateByPrimaryKeySelective(ArmDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int updateByPrimaryKey(ArmDO record);
}