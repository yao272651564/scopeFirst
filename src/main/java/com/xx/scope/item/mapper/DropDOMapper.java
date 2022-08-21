package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.DropDO;

public interface DropDOMapper {
    /**
     *
     * @mbggenerated 2019-11-14
     */
    int deleteByPrimaryKey(Long srcId);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int insert(DropDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int insertSelective(DropDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    DropDO selectByPrimaryKey(Long srcId);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int updateByPrimaryKeySelective(DropDO record);

    /**
     *
     * @mbggenerated 2019-11-14
     */
    int updateByPrimaryKey(DropDO record);
}