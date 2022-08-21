package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.DropGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DropGroupMapper {
    /**
     *
     * @mbggenerated 2022-02-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-18
     */
    int insert(DropGroup record);

    /**
     *
     * @mbggenerated 2022-02-18
     */
    int insertSelective(DropGroup record);

    /**
     *
     * @mbggenerated 2022-02-18
     */
    DropGroup selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-18
     */
    int updateByPrimaryKeySelective(DropGroup record);

    /**
     *
     * @mbggenerated 2022-02-18
     */
    int updateByPrimaryKey(DropGroup record);

    //根据掉落来源Id获取掉落物品列表
    <T> List<T> selectDropItemList(@Param("srcId") String srcId);
}