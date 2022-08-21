package com.xx.scope.common.filter;

import com.xx.scope.common.utils.RSAUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lvyk
 * @Description: 过滤器
 * @Date: 2020/5/26 16:29
 */
@Component
@WebFilter(filterName = "myFilter",urlPatterns = "/api/v1/*",/*通配符（*）表示对所有的web资源进行拦截*/
        initParams = {@WebInitParam(name = "charset", value = "utf-8")/*这里可以放一些初始化的参数*/})
public class MyFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(MyFilter.class);

    private String filterName;
    @Autowired
    private FilterUtil filterUtil;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        filterName = filterConfig.getFilterName();
        log.info("过滤器初始化方法,过滤器名："+filterName);
        //初始化方法

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        //过滤方法 主要是对request和response进行一些处理，然后交给下一个过滤器或Servlet处理
        log.info(filterName+":执行过滤方法开始====");

        // 防止流读取一次后就没有了, 所以需要将流继续写出去
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
//        filterChain.doFilter(req, res);
        //获取请求报文
        String requestBody = filterUtil.getRequestBody(httpServletRequest);
        log.info("原始请求报文="+requestBody);

        //对请求报文做解密处理
        String decrypt="";//todo  过滤器解密, webResponVO处加密返回参数
        decrypt = requestBody;
//        try {
//            decrypt = RSAUtils.decryptByPrivateKey(requestBody, RSAUtils.pri);
//            log.info("解密请求报文:"+decrypt);
//        } catch (Exception e) {
//            log.debug("请求报文解密失败。");
//            e.printStackTrace();
//        }

        Map<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("content-type","application/json");

        RequestWrapper requestWrapper = new RequestWrapper(httpServletRequest, decrypt);
        String headerNames = requestWrapper.getHeader("content-type");
        String httpServletRequestHeader = httpServletRequest.getHeader("content-type");
        //设置请求头
        requestWrapper.addHeader("content-type","application/json");
        headerNames = requestWrapper.getHeader("content-type");
        httpServletRequestHeader = httpServletRequest.getHeader("content-type");
//
//        //响应处理  包装响应对象 res 并缓存响应数据
//        ResponseWrapper responseWrapper = new ResponseWrapper((HttpServletResponse) res);
        //demo：对加密报文进行加密
        /*String strDemo="加密测试";
        try {
            log.info("base64加密之前："+strDemo);
            String encryptBASE64 = encryptBASE64(strDemo.getBytes());
            log.info("base64加密之后："+encryptBASE64);
            //将加密报文进行解密
            String decryptBASE64 = new String(decryptBASE64(encryptBASE64));
            log.info("base64解密之后："+decryptBASE64);
        } catch (Exception e) {
            log.info("base64加解密失败");
            e.printStackTrace();
        }*/





        //执行业务逻辑 交给下一个过滤器或servlet处理
        filterChain.doFilter(requestWrapper, res);
//        filterChain.doFilter(requestWrapper, responseWrapper);



//        byte[] resData = responseWrapper.getResponseData();
//        //设置响应内容格式，防止解析响应内容时出错
//        responseWrapper.setContentType("text/plain;charset=UTF-8");
//        log.info("原始响应报文:\n"+ new String(resData));
//        //加密响应报文并响应
//        String encryptBASE64="";
////        try {
////            encryptBASE64 = filterUtil.encryptBASE64(resData);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//        log.info("响应加密报文:"+encryptBASE64);
//        filterUtil.writeResponse(res, encryptBASE64);
//        log.info(filterName+":执行过滤方法结束====");
    }

    @Override
    public void destroy() {
        //销毁时调用
        log.info(filterName+":服务停止之后过滤器销毁了");

    }


}