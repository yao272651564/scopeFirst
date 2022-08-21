package com.xx.scope.user.service;

import com.xx.scope.user.domain.UserDO;
import com.xx.scope.user.vo.FightSceneVO;
import com.xx.scope.user.vo.UserRequestVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    @Transactional
    UserDO addUser() throws Exception;

    /**
     * 根据用户ID获取信息
     * @param requestVO 用户Id
     * @return 用户信息
     */
    String getUserProperty(UserRequestVO requestVO);

    /**
     * 登录用户,并返回信息, 没有用户则创建一个用户
     * @param userName
     * @param password
     * @return
     */
    @Transactional
    String addAndLogin(String userName, String password);

    /**
     *
     * @param userId
     * @param mapId
     * @return
     */
    @Transactional
    List<String> addAttackMonster(String userId, String mapId);

    /**
     * 增加经验
     * @param userId
     * @return
     */
    String addExp(String userId);

    /**
     * 获取地图列表
     * @param type 地图类型
     * @return 地图列表
     */
    String getMonsterMapList(String type);

    /**
     * 获取所有弟子列表
     * @param userId 用户ID
     * @return 弟子列表
     */
    String getUserHeroList(String userId);

    /**
     * 战斗
     * @param userId
     * @param mapId
     * @return
     */
    FightSceneVO addFightScene(String userId, String mapId);
    /**
     *  获取一个对象
     */
    String insertHeroCard(String userId);
    /**
     *  获取行动列表
     */
    String getUserHeroAciontList(String userId);

    /**
     * 装备
     */
    String updateUserHeroArm(UserRequestVO requestVO);
    /**
     *  脱下装备
     */
    String updateHeroCancelDressAram(UserRequestVO requestVO);

    /**
     * 战斗开始
     */
    String AddBattleAction(UserRequestVO requestVO);

    String insertTest(String account, String password);
}
