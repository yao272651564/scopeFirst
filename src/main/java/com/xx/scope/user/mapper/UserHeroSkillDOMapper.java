package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.UserHeroSkillDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserHeroSkillDOMapper {
    /**
     *
     * @mbggenerated 2019-12-18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-12-18
     */
    int insert(UserHeroSkillDO record);

    /**
     *
     * @mbggenerated 2019-12-18
     */
    int insertSelective(UserHeroSkillDO record);

    /**
     *
     * @mbggenerated 2019-12-18
     */
    UserHeroSkillDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-12-18
     */
    int updateByPrimaryKeySelective(UserHeroSkillDO record);

    /**
     *
     * @mbggenerated 2019-12-18
     */
    int updateByPrimaryKey(UserHeroSkillDO record);

    /**
     * 获取上阵的装备的技能列表
     * @param userId
     * @return
     */
    List<UserHeroSkillDO> selectFightHeroSkillList(@Param("userId") String userId);

}