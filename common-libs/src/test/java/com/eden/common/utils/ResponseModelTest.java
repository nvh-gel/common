package com.eden.common.utils;

import org.junit.jupiter.api.Test;

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
}
