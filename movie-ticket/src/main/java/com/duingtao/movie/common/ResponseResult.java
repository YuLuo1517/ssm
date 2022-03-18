package com.duingtao.movie.common;

public enum ResponseResult {


    SUCCESS(200, "ok"),

    ERROR(400,"method is not allow");


    private Integer code;

    private String message;

    ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
