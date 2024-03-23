package com.eden.common.utils;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ResponseModelTest {

    @Test
    void testResponseModelOk() {
        ResponseModel ok = ResponseModel.ok(null);

        assertEquals(ResponseCode.SUCCESS.getCode(), ok.getCode());
        assertEquals(ResponseMessage.SUCCESS.getText(), ok.getMessage());
        assertNull(ok.getData());
        assertNull(ok.getExtra());
    }

    @Test
    void testResponseModelAccepted() {
        ResponseModel accepted = ResponseModel.accepted(BigDecimal.ZERO);

        assertEquals(ResponseCode.ACCEPTED.getCode(), accepted.getCode());
        assertEquals(ResponseMessage.ENTITY_ACCEPTED.getText(), accepted.getMessage());
        assertEquals(BigDecimal.ZERO, accepted.getData());
        assertNull(accepted.getExtra());
    }

    @Test
    void testResponseModelCreated() {
        ResponseModel accepted = ResponseModel.created(BigDecimal.ZERO);

        assertEquals(ResponseCode.ACCEPTED.getCode(), accepted.getCode());
        assertEquals(ResponseMessage.ENTITY_CREATED.getText(), accepted.getMessage());
        assertEquals(BigDecimal.ZERO, accepted.getData());
        assertNull(accepted.getExtra());
    }

    @Test
    void testResponseModelUpdated() {
        ResponseModel accepted = ResponseModel.updated(BigDecimal.ZERO);

        assertEquals(ResponseCode.ACCEPTED.getCode(), accepted.getCode());
        assertEquals(ResponseMessage.ENTITY_UPDATED.getText(), accepted.getMessage());
        assertEquals(BigDecimal.ZERO, accepted.getData());
        assertNull(accepted.getExtra());
    }

    @Test
    void testResponseModelDeleted() {
        ResponseModel accepted = ResponseModel.deleted(BigDecimal.ZERO);

        assertEquals(ResponseCode.ACCEPTED.getCode(), accepted.getCode());
        assertEquals(ResponseMessage.ENTITY_DELETED.getText(), accepted.getMessage());
        assertEquals(BigDecimal.ZERO, accepted.getData());
        assertNull(accepted.getExtra());
    }

    @Test
    void testResponseModelUploaded() {
        ResponseModel accepted = ResponseModel.uploaded(BigDecimal.ZERO);

        assertEquals(ResponseCode.ACCEPTED.getCode(), accepted.getCode());
        assertEquals(ResponseMessage.UPLOADED.getText(), accepted.getMessage());
        assertEquals(BigDecimal.ZERO, accepted.getData());
        assertNull(accepted.getExtra());
    }

    @Test
    void testResponseModelNotFound() {
        ResponseModel notFound = ResponseModel.notFound();

        assertEquals(ResponseCode.NOT_FOUND.getCode(), notFound.getCode());
        assertEquals(ResponseMessage.ENTITY_NOT_FOUND.getText(), notFound.getMessage());
        assertNull(notFound.getData());
        assertNull(notFound.getExtra());
    }

    @Test
    void testResponseModelForbidden() {
        ResponseModel notFound = ResponseModel.forbidden();

        assertEquals(ResponseCode.FORBIDDEN.getCode(), notFound.getCode());
        assertEquals(ResponseMessage.FORBIDDEN.getText(), notFound.getMessage());
        assertNull(notFound.getData());
        assertNull(notFound.getExtra());
    }

    @Test
    void testResponseModelUnauthorized() {
        ResponseModel notFound = ResponseModel.unauthorized();

        assertEquals(ResponseCode.UNAUTHORIZED.getCode(), notFound.getCode());
        assertEquals(ResponseMessage.UNAUTHORIZED.getText(), notFound.getMessage());
        assertNull(notFound.getData());
        assertNull(notFound.getExtra());
    }

    @Test
    void testResponseModelError() {
        ResponseModel notFound = ResponseModel.error(null);

        assertEquals(ResponseCode.INTERNAL_ERROR.getCode(), notFound.getCode());
        assertEquals(ResponseMessage.INTERNAL_ERROR.getText(), notFound.getMessage());
        assertNull(notFound.getData());
        assertNull(notFound.getExtra());
    }

    @Test
    void testResponseModelBadRequest() {
        ResponseModel accepted = ResponseModel.badRequest();

        assertEquals(ResponseCode.BAD_REQUEST.getCode(), accepted.getCode());
        assertEquals(ResponseMessage.BAD_REQUEST.getText(), accepted.getMessage());
        assertNull(accepted.getData());
        assertNull(accepted.getExtra());
    }
}
