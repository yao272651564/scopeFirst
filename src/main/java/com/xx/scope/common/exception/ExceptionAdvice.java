package com.xx.scope.common.exception;

import com.xx.scope.common.WebResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常捕捉
 */
@ControllerAdvice
public class ExceptionAdvice {
    public static Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public WebResponse handleException(Exception e) {
        logger.error("系统异常信息：", e);
        return WebResponse.errorMessage(e.getMessage());
    }

   /* @ExceptionHandler(Exception.class)
    @ResponseBody
    public WebResponse handleException(RuntimeException e) {
        logger.error("运行时异常信息：", e.getMessage());
        WebResponse webResponse = new WebResponse();
        webResponse.setCode(WebResponseCode.ERROR.getValue());
        webResponse.setMessage(e.getMessage());
        return webResponse;
    }*/

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public WebResponse doBusinessException(ServiceException e) {
        logger.warn("业务异常消息：", e);
        return WebResponse.errorMessage(e.getMessage());
    }



}