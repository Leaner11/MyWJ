package com.example.wj.result;

/**
 * Created by Enzo Cotter on 2020/6/28.
 */
public class Result {
    //响应码
    int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
