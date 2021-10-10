package com.hc.handler;

import com.hc.entity.CommonResult;
import com.hc.enums.ResultCodeEnum;
import com.hc.exception.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 全局异常处理
 * @author ：hc
 * @date ：Created in 2021/10/9 22:20
 * @modified ：
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 通用异常处理
     * @param e 异常信息
     * @return CommonResult
     */
    @ExceptionHandler(Exception.class)
    public CommonResult exception(Exception e) {
        log.error(e.getMessage(), e);
        return CommonResult.error();
    }

    /**
     * 请求路径不存在
     * @return CommonResult
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public CommonResult notFoundException(Exception e) {
        log.error(e.getMessage(), e);
        return CommonResult.setResult(ResultCodeEnum.NOT_FOUND);
    }

    /**
     * 请求参数异常
     * @param e 异常信息
     * @return CommonResult
     */
    @ExceptionHandler({HttpMessageNotReadableException.class, MissingServletRequestParameterException.class, MissingServletRequestPartException.class, BindException.class})
    public CommonResult paramException(Exception e) {
        log.error(e.getMessage(), e);
        return CommonResult.setResult(ResultCodeEnum.PARAM_ERROR);
    }

    /**
     * 自定义异常处理
     * @return CommonResult
     */
    @ExceptionHandler(BaseException.class)
    public CommonResult baseException(BaseException e) {
        log.error(e.getMessage(), e);
        return CommonResult.error().message(e.getMessage()).code(e.getCode());
    }

}
