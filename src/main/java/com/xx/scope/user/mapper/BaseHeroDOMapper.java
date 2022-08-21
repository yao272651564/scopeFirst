package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.BaseHeroDO;

public interface BaseHeroDOMapper {
    /**
     *
     * @mbggenerated 2019-12-12
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-12-12
     */
    int insert(BaseHeroDO record);

    /**
     *
     * @mbggenerated 2019-12-12
     */
    int insertSelective(BaseHeroDO record);

    /**
     *
     * @mbggenerated 2019-12-12
     */
    BaseHeroDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-12-12
     */
    int updateByPrimaryKeySelective(BaseHeroDO record);

    /**
     *
     * @mbggenerated 2019-12-12
     */
    int updateByPrimaryKey(BaseHeroDO record);
}