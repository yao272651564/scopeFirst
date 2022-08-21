package com.xx.scope.common.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author lvyk
 * @Description: 供过滤器使用的工具类
 * @Date 2020/5/27 14:05
 * @Modify By:
 */
@Component
public class FilterUtil {
    private static final Logger log = LoggerFactory.getLogger(FilterUtil.class);

//    /**
//     * BASE64加密
//     */
//    public String encryptBASE64(byte[] key) throws Exception {
//        return (new BASE64Encoder()).encodeBuffer(key);
//    }
//
//    /**
//     * BASE64解密
//     */
//    public byte[] decryptBASE64(String key) throws Exception {
//        return (new BASE64Decoder()).decodeBuffer(key);
//    }

    /**
     * @Author: lvyk
     * @Description: 获取请求信息中请求报文
     * @Date: 2020/5/27 14:08
     * @Param: [req]
     * @Return: java.lang.String
     */
    public String getRequestBody(HttpServletRequest req) {
        try {
            BufferedReader reader = req.getReader();
            StringBuffer sb = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            String json = sb.toString();
            return json;
        } catch (IOException e) {
            log.error("验签时请求体读取失败", e);
        }
        return "";
    }

    /**
     * @Author: lvyk
     * @Description: 响应内容
     * @Date: 2020/5/27 14:15
     */
    public void writeResponse(ServletResponse response, String responseString) throws IOException {
        PrintWriter out = response.getWriter();
        out.print(responseString);
        out.flush();
        out.close();
    }


}