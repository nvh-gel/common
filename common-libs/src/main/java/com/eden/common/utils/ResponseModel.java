package com.eden.common.utils;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Returned response data to client.
 */
@SuppressWarnings("unused")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseModel {

    private String code;
    private String message;
    private Object data;
    private Object extra;


    /**
     * Return a successful response.
     *
     * @param data retrieved information
     * @return response data
     */
    public static ResponseModel ok(Object data) {
        return new ResponseModel(
                ResponseCode.SUCCESS.getCode(),
                ResponseMessage.SUCCESS.getText(),
                data,
                null);
    }

    /**
     * Return a created response.
     *
     * @param data created information
     * @return response data
     */
    public static ResponseModel created(Object data) {
        return new ResponseModel(
                ResponseCode.ACCEPTED.getCode(),
                ResponseMessage.ENTITY_CREATED.getText(),
                data,
                null);
    }

    /**
     * Return an updated response.
     *
     * @param data updated information
     * @return response data
     */
    public static ResponseModel updated(Object data) {
        return new ResponseModel(
                ResponseCode.ACCEPTED.getCode(),
                ResponseMessage.ENTITY_UPDATED.getText(),
                data,
                null);
    }

    /**
     * Return a deleted response.
     *
     * @param data deleted information
     * @return response data
     */
    public static ResponseModel deleted(Object data) {
        return new ResponseModel(
                ResponseCode.ACCEPTED.getCode(),
                ResponseMessage.ENTITY_DELETED.getText(),
                data,
                null);
    }

    /**
     * Return an uploaded response.
     *
     * @param data uploaded information
     * @return response data
     */
    public static ResponseModel uploaded(Object data) {
        return new ResponseModel(
                ResponseCode.ACCEPTED.getCode(),
                ResponseMessage.UPLOADED.getText(),
                data,
                null);
    }

    /**
     * Return a response model of bad request.
     *
     * @return response data
     */
    public static ResponseModel badRequest() {
        return new ResponseModel(
                ResponseCode.BAD_REQUEST.getCode(),
                ResponseMessage.BAD_REQUEST.getText(),
                null, null
        );
    }

    /**
     * Return an unauthorized response.
     *
     * @return response data
     */
    public static ResponseModel unauthorized() {
        return new ResponseModel(
                ResponseCode.UNAUTHORIZED.getCode(),
                ResponseMessage.UNAUTHORIZED.getText(),
                null, null
        );
    }

    /**
     * Return a access forbidden response.
     *
     * @return response data
     */
    public static ResponseModel forbidden() {
        return new ResponseModel(
                ResponseCode.FORBIDDEN.getCode(),
                ResponseMessage.FORBIDDEN.getText(),
                null, null
        );
    }

    /**
     * Return response for data not found.
     *
     * @return response data
     */
    public static ResponseModel notFound() {
        return new ResponseModel(
                ResponseCode.NOT_FOUND.getCode(),
                ResponseMessage.ENTITY_NOT_FOUND.getText(),
                null,
                null);
    }

    /**
     * Return a response of internal error.
     *
     * @param data error data
     * @return response data
     */
    public static ResponseModel error(Object data) {
        return new ResponseModel(
                ResponseCode.INTERNAL_ERROR.getCode(),
                ResponseMessage.INTERNAL_ERROR.getText(),
                data,
                null);
    }
}
