
package com.xx.scope.common;


public enum WebResponseCode {

    // 成功
    SUCCESS(0),
    // 失败
    ERROR(1),
    //自定义(列如:部分成功等)
    DEFINED(2),
    // 重复提交
    SUBMITED(3),
    // 重定向
    FORBIDDEN(4),
    // 心跳
    HEARTBEAT(6),
    // 错误数据格式
    ERROR_FORMAT(10);

    public int value;

    private WebResponseCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isSuccess() {
        return this == SUCCESS;
    }

    public boolean isError() {
        return this == ERROR;
    }

    public boolean isNeedLogin() {
        return this == DEFINED;
    }

    public boolean isSubmited() {
        return this == SUBMITED;
    }

    public static boolean isSuccess(int value) {
        return SUCCESS.getValue() == value;
    }

    public static boolean isError(int value) {
        return ERROR.getValue() == value;
    }

    public static boolean isNeedLogin(int value) {
        return DEFINED.getValue() == value;
    }

    public static boolean isSubmited(int value) {
        return SUBMITED.getValue() == value;
    }

    public static WebResponseCode getEnum(int value) {
        for (WebResponseCode code : values()) {
            if (value == code.getValue()) return code;
        }
        return null;
    }
}
