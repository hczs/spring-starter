package com.hc.exception;

import com.hc.enums.ResultCodeEnum;
import lombok.Data;

/**
 * 基本异常封装
 * @author ：hc
 * @date ：Created in 2021/10/8 20:33
 * @modified ：
 */
@Data
public class BaseException extends RuntimeException{

    private Integer code;

    /**
     * 基本异常
     * @param code 状态码
     * @param message 异常信息
     */
    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * 基本异常
     * @param resultCodeEnum 响应结果枚举
     */
    public BaseException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "BaseException{" + "code=" + code + ", message=" + getMessage() + '}';
    }
}
