package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.UserItemDO;

public interface UserItemDOMapper {
    /**
     *
     * @mbggenerated 2019-11-25
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-25
     */
    int insert(UserItemDO record);

    /**
     *
     * @mbggenerated 2019-11-25
     */
    int insertSelective(UserItemDO record);

    /**
     *
     * @mbggenerated 2019-11-25
     */
    UserItemDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-25
     */
    int updateByPrimaryKeySelective(UserItemDO record);

    /**
     *
     * @mbggenerated 2019-11-25
     */
    int updateByPrimaryKey(UserItemDO record);
}