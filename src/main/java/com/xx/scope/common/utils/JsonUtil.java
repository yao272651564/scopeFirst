package com.xx.scope.common.utils;

import com.alibaba.fastjson.JSONArray;

public class JsonUtil {

    private JsonUtil(){}

    /**
     * 对象/列表转json
     * @param object 对象/列表
     * @return json对象
     */
    public static Object ObjToJson(Object object) {
        return JSONArray.toJSON(object);
    }

    /**
     * 对象/列表转json字符串
     * @param object 对象/列表
     * @return json字符串
     */
    public static String ObjToJsonStr(Object object) {
        return ObjToJson(object).toString();

    }

}
