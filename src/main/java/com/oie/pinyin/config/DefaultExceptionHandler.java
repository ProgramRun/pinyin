package com.oie.pinyin.config;

import com.oie.pinyin.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * web mvc 统一异常处理
 * </p>
 * 1. 会根据错误代码查询错误消息
 */
@ControllerAdvice
@Slf4j
public class DefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse defaultExceptionHandler(HttpServletRequest request, Exception exception) {
        if (exception instanceof BaseRuntimeException) {
            BaseRuntimeException brException = (BaseRuntimeException) exception;
            return parseExceptionResponse(brException.getErrorCode(), brException.getErrorMsg(), brException);
        }
        log.error("【错误异常】 错误信息： {}, 上下文： {}", exception, null);
        return parseExceptionResponse(SysErrorCode.BUSY, exception.getMessage(), null);
    }

    private ApiResponse parseExceptionResponse(int errorCode, String errorMsg, BaseRuntimeException brException) {
        if (StringUtils.isEmpty(errorMsg)) {
            errorMsg = ErrorCodeContext.get(errorCode);
        }

        if (StringUtils.isEmpty(errorMsg)) {
            errorMsg = "System Busy";
            if (errorCode != 0) {
                errorMsg += "，错误代码：" + errorCode;
                if (brException != null) {
                    log.error("请求处理失败：{}", brException);
                }
            }
        }

        return ApiResponse.getErrResponse(errorCode, errorMsg);
    }
}
