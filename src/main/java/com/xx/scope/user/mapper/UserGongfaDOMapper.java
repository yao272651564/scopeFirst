package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.UserGongfaDO;
import com.xx.scope.user.domain.UserGongfaDOKey;
import org.apache.ibatis.annotations.Param;

public interface UserGongfaDOMapper {
    /**
     *
     * @mbggenerated 2019-11-01
     */
    int deleteByPrimaryKey(UserGongfaDOKey key);

    /**
     *
     * @mbggenerated 2019-11-01
     */
    int insert(UserGongfaDO record);

    /**
     *
     * @mbggenerated 2019-11-01
     */
    int insertSelective(UserGongfaDO record);

    /**
     *
     * @mbggenerated 2019-11-01
     */
    UserGongfaDO selectByPrimaryKey(UserGongfaDOKey key);

    /**
     *
     * @mbggenerated 2019-11-01
     */
    int updateByPrimaryKeySelective(UserGongfaDO record);

    /**
     *
     * @mbggenerated 2019-11-01
     */
    int updateByPrimaryKey(UserGongfaDO record);

    /**
     * 获取用户所有功法的加成
     * @param userId
     * @return
     */
    UserGongfaDO selectAllGongFaSum(@Param("userId") Long userId);
}