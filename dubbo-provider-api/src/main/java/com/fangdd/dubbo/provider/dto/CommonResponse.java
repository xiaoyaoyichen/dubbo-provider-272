package com.fangdd.dubbo.provider.dto;

import java.io.Serializable;

/**
 * This is Description
 *
 * @author chenruifeng
 * @date 2019/8/17
 */
public class CommonResponse<T> implements Serializable {

    private static final Integer SUCCESS_CODE = 200;
    private static final String SUCCESS_MSG = "Success";

    private Integer code;
    private String msg;
    private T data;

    private CommonResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static CommonResponse success() {
        return createResponse(SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> CommonResponse<T> successWithData(T data) {
        return createResponse(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    private static <T> CommonResponse<T> createResponse(Integer code, String msg, T data) {
        return new CommonResponse<>(code, msg, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
