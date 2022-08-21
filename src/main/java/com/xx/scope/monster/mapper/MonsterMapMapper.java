package com.xx.scope.monster.mapper;

import com.xx.scope.monster.domain.MonsterMap;

public interface MonsterMapMapper {
    /**
     *
     * @mbggenerated 2022-02-16
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-16
     */
    int insert(MonsterMap record);

    /**
     *
     * @mbggenerated 2022-02-16
     */
    int insertSelective(MonsterMap record);

    /**
     *
     * @mbggenerated 2022-02-16
     */
    MonsterMap selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-16
     */
    int updateByPrimaryKeySelective(MonsterMap record);

    /**
     *
     * @mbggenerated 2022-02-16
     */
    int updateByPrimaryKey(MonsterMap record);
}