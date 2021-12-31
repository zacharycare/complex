package com.az.complex.core.common.response;

public enum ResultCode {

    SUCCESS("000000", "操作成功"),
    FAILURE("999999", "操作失败"),
    NO_DATA_FOUND("900001", "未查到数据");

    private String code;

    private String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
