package com.xx.scope.hero.mapper;

import com.xx.scope.hero.domain.HeroDO;

import java.util.List;

public interface HeroDOMapper {
    /**
     *
     * @mbggenerated 2022-01-08
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-01-08
     */
    int insert(HeroDO record);

    /**
     *
     * @mbggenerated 2022-01-08
     */
    int insertSelective(HeroDO record);

    /**
     *
     * @mbggenerated 2022-01-08
     */
    HeroDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-01-08
     */
    int updateByPrimaryKeySelective(HeroDO record);

    /**
     *
     * @mbggenerated 2022-01-08
     */
    int updateByPrimaryKey(HeroDO record);

    List<HeroDO> selectRandomHeroList();
}