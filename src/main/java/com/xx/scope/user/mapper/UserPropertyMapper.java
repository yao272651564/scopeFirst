package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.UserProperty;
import org.apache.ibatis.annotations.Param;

public interface UserPropertyMapper {
    /**
     *
     * @mbggenerated 2022-08-21
     */
    int deleteByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated 2022-08-21
     */
    int insert(UserProperty record);

    /**
     *
     * @mbggenerated 2022-08-21
     */
    int insertSelective(UserProperty record);

    /**
     *
     * @mbggenerated 2022-08-21
     */
    UserProperty selectByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated 2022-08-21
     */
    int updateByPrimaryKeySelective(UserProperty record);

    /**
     *
     * @mbggenerated 2022-08-21
     */
    int updateByPrimaryKey(UserProperty record);

    /**
     * 增加经验和金钱
     */
    void updateExpAndMoney(@Param("userId") String userId, @Param("monsterMapId")Long monsterMapId, @Param("dropExp") Long dropExp, @Param("dropMoney") Long dropMoney, @Param("dropYuanBao") Long dropYuanBao);
}