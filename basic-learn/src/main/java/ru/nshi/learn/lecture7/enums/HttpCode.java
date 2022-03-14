package ru.nshi.learn.lecture7.enums;

/**
 * @author rassafel
 */
public enum HttpCode {
    _200(200),
    _300(300),
    _400(400),
    _500(500);
    public int code;

    HttpCode(int code) {
        this.code = code;
    }

    public boolean isError() {
        return code >= 400;
    }
}
