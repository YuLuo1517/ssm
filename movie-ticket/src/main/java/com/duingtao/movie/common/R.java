package com.duingtao.movie.common;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class R<T> implements Serializable {
    private static final long serialVersionUID = 7878113640556758120L;

    //  状态码
    private Integer code;

    //  状态信息
    private String message;

    // 数据类型
    private T data;

    public R(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private R(ResponseResult result, T data) {
        this.code = result.getCode();
        this.message = result.getMessage();
        this.data = data;
    }

    /**
     * 传递数据
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> R<T> success(T data) {
        R<T> result = new R<>(ResponseResult.SUCCESS, data);
        return result;
    }


    public static <T> R<T> error(T data) {
        R<T> result = new R<T>(ResponseResult.ERROR, data);
        return result;
    }


}
