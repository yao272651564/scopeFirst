package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.UserDO;
import org.apache.ibatis.annotations.Param;

public interface UserDOMapper {
    /**
     *
     * @mbggenerated 2019-11-04
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-04
     */
    int insert(UserDO record);

    /**
     *
     * @mbggenerated 2019-11-04
     */
    int insertSelective(UserDO record);

    /**
     *
     * @mbggenerated 2019-11-04
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-04
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     *
     * @mbggenerated 2019-11-04
     */
    int updateByPrimaryKey(UserDO record);

    /**
     * 根据账号获取用户信息
     * @param account
     * @return UserDO
     */
    UserDO selectUserByAccount(@Param("account") String account);

    /**
     * 按基础资质增加经验
     * @param userId
     */
    void updateExp(@Param("userId") String userId);

}