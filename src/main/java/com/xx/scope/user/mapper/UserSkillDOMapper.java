package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.UserSkillDO;
import com.xx.scope.user.domain.UserSkillDOKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserSkillDOMapper {
    /**
     *
     * @mbggenerated 2019-10-29
     */
    int deleteByPrimaryKey(UserSkillDOKey key);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int insert(UserSkillDO record);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int insertSelective(UserSkillDO record);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    UserSkillDO selectByPrimaryKey(UserSkillDOKey key);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int updateByPrimaryKeySelective(UserSkillDO record);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int updateByPrimaryKey(UserSkillDO record);

    List<UserSkillDO> selectUseSkillList(@Param("userId") String userId);
}