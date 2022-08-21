package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.UserHeroDO;
import com.xx.scope.user.domain.UserHeroDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserHeroDOMapper {
    /**
     *
     * @mbggenerated 2022-01-10
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-01-10
     */
    int insert(UserHeroDO record);

    /**
     *
     * @mbggenerated 2022-01-10
     */
    int insertSelective(UserHeroDO record);

    /**
     *
     * @mbggenerated 2022-01-10
     */
    UserHeroDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-01-10
     */
    int updateByPrimaryKeySelective(UserHeroDO record);

    /**
     *
     * @mbggenerated 2022-01-10
     */
    int updateByPrimaryKey(UserHeroDO record);

    List<UserHeroDTO> selectUserHeroList( @Param("userId") String userId, @Param("isAciton") String isAciton);

    /**
     * 计算单个英雄的属性(人物属性+装备属性)
     */
    int updateHeroPropertyById(@Param("id")Long heroId);

    /**
     * 计算用户所有角色属性
     * @param userId 用户Id
     */
    int updateHeroPropertyByUserId(@Param("userId")Long userId);
}