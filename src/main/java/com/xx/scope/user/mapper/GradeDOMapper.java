package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.GradeDO;

public interface GradeDOMapper {
    /**
     *
     * @mbggenerated 2019-10-31
     */
    int deleteByPrimaryKey(Integer levelNum);

    /**
     *
     * @mbggenerated 2019-10-31
     */
    int insert(GradeDO record);

    /**
     *
     * @mbggenerated 2019-10-31
     */
    int insertSelective(GradeDO record);

    /**
     *
     * @mbggenerated 2019-10-31
     */
    GradeDO selectByPrimaryKey(Integer levelNum);

    /**
     *
     * @mbggenerated 2019-10-31
     */
    int updateByPrimaryKeySelective(GradeDO record);

    /**
     *
     * @mbggenerated 2019-10-31
     */
    int updateByPrimaryKey(GradeDO record);
}