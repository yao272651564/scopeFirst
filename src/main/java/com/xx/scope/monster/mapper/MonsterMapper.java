package com.xx.scope.monster.mapper;

import com.xx.scope.monster.domain.Monster;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MonsterMapper {
    /**
     *
     * @mbggenerated 2022-02-15
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-15
     */
    int insert(Monster record);

    /**
     *
     * @mbggenerated 2022-02-15
     */
    int insertSelective(Monster record);

    /**
     *
     * @mbggenerated 2022-02-15
     */
    Monster selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-15
     */
    int updateByPrimaryKeySelective(Monster record);

    /**
     *
     * @mbggenerated 2022-02-15
     */
    int updateByPrimaryKey(Monster record);

    //获取关卡敌人列表
    List<Monster> selectMonsterList(@Param("mapId")String mapId);
}