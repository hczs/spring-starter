package com.hc.enums;

import lombok.Getter;

/**
 * 响应结果枚举
 * @author ：hc
 * @date ：Created in 2021/10/9 20:34
 * @modified ：
 */
@Getter
public enum ResultCodeEnum {

    /** 成功 */
    SUCCESS(true, 0, "成功"),
    /** 未知错误 */
    UNKNOWN_ERROR(false, -1, "未知错误"),
    /** 参数错误 */
    PARAM_ERROR(false, 400, "参数错误"),
    /** 路径不存在 */
    NOT_FOUND(false, 404, "路径不存在");

    private final Boolean success;

    private final Integer code;

    private final String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
