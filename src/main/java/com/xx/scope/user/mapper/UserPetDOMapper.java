package com.xx.scope.user.mapper;

import com.xx.scope.user.domain.UserPetDO;
import com.xx.scope.user.domain.UserPetDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPetDOMapper {
    /**
     *
     * @mbggenerated 2019-10-29
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int insert(UserPetDO record);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int insertSelective(UserPetDO record);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    UserPetDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int updateByPrimaryKeySelective(UserPetDO record);

    /**
     *
     * @mbggenerated 2019-10-29
     */
    int updateByPrimaryKey(UserPetDO record);

    List<UserPetDTO> selectUsePetList(@Param("userId") String userId);
}