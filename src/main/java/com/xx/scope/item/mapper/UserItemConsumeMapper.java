package com.xx.scope.item.mapper;

import com.xx.scope.item.domain.DropGroupDTO;
import com.xx.scope.item.domain.UserItemConsume;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserItemConsumeMapper {
    /**
     *
     * @mbggenerated 2022-02-20
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int insert(UserItemConsume record);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int insertSelective(UserItemConsume record);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    UserItemConsume selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int updateByPrimaryKeySelective(UserItemConsume record);

    /**
     *
     * @mbggenerated 2022-02-20
     */
    int updateByPrimaryKey(UserItemConsume record);

    /**
     * 获取道具列表
     * @param userId 用户Id
     * @return 道具列表
     */
    List<UserItemConsume> selectUserItemConsumeList(String userId);

    //将掉落的商品放到商品表
    void insertBatchItemConsumeList(@Param("dropItemConsumeList") List<DropGroupDTO> dropItemConsumeList, @Param("userId") String userId);
}