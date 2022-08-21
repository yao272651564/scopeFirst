package com.xx.scope.user.controller;

import com.xx.scope.common.WebResponse;
import com.xx.scope.user.service.UserService;
import com.xx.scope.user.vo.LoginRequestVO;
import com.xx.scope.user.vo.UserRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/user")
@EnableTransactionManagement
public class UserController {

//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    // todo 事务没有回滚问题待处理

    @Autowired
    private UserService userService;

    /**
     * 用户登录,不存在用则自动添加此用户
     * 如果和上次登录设备信息一致, 那么不需要重新登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public WebResponse login(@RequestBody LoginRequestVO requestVO) {
//        return WebResponse.successData(userService.insertTest(requestVO.account, requestVO.password));// 测试
        return WebResponse.successData(userService.addAndLogin(requestVO.account, requestVO.password));
    }

    /**
     * 用户登录,不存在用则自动添加此用户
     * 如果和上次登录设备信息一致, 那么不需要重新登录
     */
    @RequestMapping("/getUserProperty")
    @ResponseBody
    public WebResponse getUserProperty(@RequestBody UserRequestVO requestVO) {
         return WebResponse.successData(userService.getUserProperty(requestVO));
    }

    /**
     * 抽奖角色
     * 返回抽到的列表
     */
    @RequestMapping("/getHeroCard")
    @ResponseBody
    public WebResponse getHeroCard(@RequestBody UserRequestVO requestVO) {
        return WebResponse.successData(userService.insertHeroCard(requestVO.userId));
    }


    /**
     *  获取行动列表
     */
    @RequestMapping("/getUserHeroAciontList")
    @ResponseBody
    public WebResponse getUserHeroAciontList(@RequestBody UserRequestVO requestVO) {
        return WebResponse.successData(userService.getUserHeroAciontList(requestVO.userId));
    }
    /**
     *  穿戴装备
     */
    @RequestMapping("/dressAram")
    @ResponseBody
    public WebResponse dressAram(@RequestBody UserRequestVO requestVO) {
        return WebResponse.successData(userService.updateUserHeroArm(requestVO));
    }
    /**
     *  脱下装备
     */
    @RequestMapping("/cancelDressAram")
    @ResponseBody
    public WebResponse cancelDressAram(@RequestBody UserRequestVO requestVO) {
        return WebResponse.successData(userService.updateHeroCancelDressAram(requestVO));
    }

/*
    *//**
     * 跳转主页面
     *//*
    @RequestMapping("/start")
    public ModelAndView start(HttpSession session) {
        GetUserInfoRspVO user = (GetUserInfoRspVO) session.getAttribute("user");
        GetUserInfoRspVO responseVO = userService.getUserInfo(user.getData().getId());
        session.setAttribute("user", responseVO);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",responseVO);
        modelAndView.addObject("message","ddd");
        modelAndView.setViewName("user/index");
        return modelAndView;
    }*/

    /**
     * 获取自己的信息
     */
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public WebResponse getUserInfo(String appRequest) {
      /*  WebResponse webResponse = new WebResponse();
        logger.info(appRequest);
        try {
//            GetUserInfoRspVO user = (GetUserInfoRspVO) session.getAttribute("user");
            GetUserInfoRspVO responseVO = userService.getUserInfo("384770921489108992");
            webResponse.setCode(WebResponseCode.SUCCESS.value);
            webResponse.setData(responseVO);
            webResponse.setMessage("成功!");
        } catch (Exception e) {
            webResponse.setCode(WebResponseCode.ERROR.value);
            webResponse.setMessage("失败!" + e.getMessage());
        }
        return webResponse;*/
      return null;
    }

    //增加经验
    @RequestMapping("/addExp")
    @ResponseBody
    public WebResponse addExp(String userId) {
       /* WebResponse webResponse = new WebResponse();
        try {
            GetUserInfoRspVO responseVO = userService.addExp(userId);
            webResponse.setCode(WebResponseCode.SUCCESS.value);
            webResponse.setData(responseVO);
            webResponse.setMessage("成功!");
        } catch (Exception e) {
            webResponse.setCode(WebResponseCode.ERROR.value);
            webResponse.setMessage("失败!" + e.getMessage());
        }
        return webResponse;*/
       return null;
    }

    /**
     * 获取地图列表
     * @param type 地图类型
     */
    @RequestMapping("/getMonsterMapList.do")
    @ResponseBody
    public WebResponse getMonsterMapList(String type) {
      /*  type = "1";
        WebResponse webResponse = new WebResponse();
        try {
            String responseVO = userService.getMonsterMapList(type);
            webResponse.setCode(WebResponseCode.SUCCESS.value);
            webResponse.setData(responseVO);
        } catch (Exception e) {
            e.printStackTrace();
            webResponse.setCode(WebResponseCode.ERROR.value);
            webResponse.setMessage("出现错误!");
        }

        return webResponse;*/
        return null;

    }


    /**
     * 获取所有弟子列表 todo
     */
    @RequestMapping("/getUserHeroList.do")
    @ResponseBody
    public WebResponse getUserHeroList(String userId) {
/*        try {
//            GetUserHeroListRspVO responseVO = userService.getUserHeroList(userId);
            String responseJsonStr = userService.getUserHeroList(userId);
            return WebResponse.successData(responseJsonStr);
        } catch (ServiceException e) {
            return WebResponse.errorMessage("服务器开小差!");
        } catch (Exception e) {
            logger.error("userService.getUserHeroList()调用异常,异常信息是:{}", e);
            return WebResponse.errorMessage("服务器开小差!");
        }*/
        return null;

    }

//    http://localhost:8082/xx_scope/user/attackMonster?userId=384770921489108992&mapId=1
    /**
     * 开始打怪  384770921489108992
     */
    @RequestMapping("/attackMonster")
    @ResponseBody

    public WebResponse addAttackMonster(@RequestBody UserRequestVO requestVO) {
        return WebResponse.successData(userService.AddBattleAction(requestVO));


      /*  String userId = String.valueOf(userDO.getUserId());
        logger.info( "userId="+ userId);
        String mapId = userDO.getMapId();
        logger.info("mapId="+ mapId);
        WebResponse webResponse = new WebResponse();
        try {
            List<String> responseVO = userService.addAttackMonster(userId, mapId);
            webResponse.setCode(WebResponseCode.SUCCESS.value);
            webResponse.setData(responseVO);
        } catch (Exception e) {
            webResponse.setCode(WebResponseCode.ERROR.value);
            webResponse.setMessage("出错!" + e.getMessage());
        }

        return webResponse;*/

    }

    /**
     * 普通战斗
     * @param userId
     * @param mapId
     * @return
     */
    @RequestMapping("/fightScene")
    @ResponseBody
    public WebResponse fightScene(String userId, String mapId) {
     /*   WebResponse webResponse = new WebResponse();
        try {
            FightSceneVO responseVO = userService.addFightScene(userId, mapId);
            webResponse.setCode(WebResponseCode.SUCCESS.value);
            webResponse.setData(responseVO);
        } catch (Exception e) {
            webResponse.setCode(WebResponseCode.ERROR.value);
            webResponse.setMessage("出错!" + e.getMessage());
        }

        return webResponse;*/
        return null;

    }

    public void aa() {
        //对战
        //我方id 获取我方阵容

        //对方id 获取地方阵容
    }


    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser() {
     /*   UserDO d = null;
        try {
            d = userService.addUser();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return "111";
    }

    //获取用户功法列表 TODO

    ///用户突破等级 TODO




    public static void main(String[] str){
        Random r = new Random();
        int n = r.nextInt(10000);
        System.err.println(n);
        if (n < 2) {
            System.out.println("C");
        } else if (n >= 2 && n < 5) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
