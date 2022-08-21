package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.TestInsert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestInsertMapper {
    /**
     *
     * @mbggenerated 2022-02-19
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2022-02-19
     */
    int insert(TestInsert record);

    /**
     *
     * @mbggenerated 2022-02-19
     */
    int insertSelective(TestInsert record);

    /**
     *
     * @mbggenerated 2022-02-19
     */
    TestInsert selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2022-02-19
     */
    int updateByPrimaryKeySelective(TestInsert record);

    /**
     *
     * @mbggenerated 2022-02-19
     */
    int updateByPrimaryKey(TestInsert record);

    void insertBatch(@Param("list")List<TestInsert> list);
}