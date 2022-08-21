package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.DropGroupDTO;
import com.xx.scope.item.domain.UserItemArm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserItemArmMapper {
    /**
     *
     * @mbggenerated 2022-02-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int insert(UserItemArm record);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int insertSelective(UserItemArm record);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    UserItemArm selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int updateByPrimaryKeySelective(UserItemArm record);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int updateByPrimaryKey(UserItemArm record);

    /**
     * 获取装备列表
     * @param userId 用户Id
     * @return 列表
     */
    List<UserItemArm> selectUserArmList(@Param("userId") String userId);

    /**
     * 根据英雄装备位置查询是否有装备
     * @param userId 用户
     * @param userHeroId 英雄ID
     * @param armPostion 位置
     * @return 装备信息
     */
     UserItemArm selectUserItemArmByPosion(@Param("userId")String userId, @Param("userHeroId")String userHeroId, @Param("armPostion")String armPostion);

     //批量添加掉落商品列表
    void insertBatchItemArmList(@Param("dropItemArmList") List<DropGroupDTO> dropItemArmList,  @Param("userId") String userId);
}