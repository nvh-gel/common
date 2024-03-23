package com.eden.data.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BaseModelTest {

    static class TestModel extends BaseModel {
    }

    @Test
    void testLoadContext() {

        TestModel test = new TestModel();
        assertNotNull(test);
    }
}
