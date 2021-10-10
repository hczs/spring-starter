package com.hc.entity;

import com.hc.enums.ResultCodeEnum;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一结果返回
 * @author ：hc
 * @date ：Created in 2021/10/8 21:24
 * @modified ：
 */
@Data
public class CommonResult {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<>();

    private CommonResult() { }

    public static CommonResult ok() {
        CommonResult commonResult = new CommonResult();
        commonResult.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        commonResult.setCode(ResultCodeEnum.SUCCESS.getCode());
        commonResult.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return commonResult;
    }

    public static CommonResult error() {
        CommonResult commonResult = new CommonResult();
        commonResult.setSuccess(ResultCodeEnum.UNKNOWN_ERROR.getSuccess());
        commonResult.setCode(ResultCodeEnum.UNKNOWN_ERROR.getCode());
        commonResult.setMessage(ResultCodeEnum.UNKNOWN_ERROR.getMessage());
        return commonResult;
    }

    public static CommonResult setResult(ResultCodeEnum resultCodeEnum) {
        CommonResult commonResult = new CommonResult();
        commonResult.setSuccess(resultCodeEnum.getSuccess());
        commonResult.setCode(resultCodeEnum.getCode());
        commonResult.setMessage(resultCodeEnum.getMessage());
        return commonResult;
    }


    public CommonResult data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }


    public CommonResult data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public CommonResult message(String message) {
        this.setMessage(message);
        return this;
    }

    public CommonResult code(Integer code) {
        this.setCode(code);
        return this;
    }

    public CommonResult success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

}
