package com.eden.common.utils;

import lombok.Getter;

/**
 * Returned response code to client.
 */
@Getter
public enum ResponseCode {

    SUCCESS("200"),
    ACCEPTED("202"),

    BAD_REQUEST("400"),
    UNAUTHORIZED("401"),
    FORBIDDEN("403"),
    NOT_FOUND("404"),

    INTERNAL_ERROR("500"),
    ;
    private final String code;

    ResponseCode(String code) {
        this.code = code;
    }
}
