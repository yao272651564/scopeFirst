package com.xx.scope.page;


import com.xx.scope.common.exception.ServiceException;

/**
 * 分页工具类
 */
public class PageUtils {
    /**
     * 设置分页参数
     * @param start 分页开始行数
     * @param length 分页每页显示行数
     */
    public static void setPageParam(String start, String length) {
        try {
            SystemContext.setOffset(Integer.valueOf(start));
            SystemContext.setPagesize(Integer.valueOf(length));
        } catch (Exception e) {
            throw new ServiceException("分页参数错误!");
        }
    }

}
