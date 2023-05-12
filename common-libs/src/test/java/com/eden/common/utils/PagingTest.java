package com.eden.common.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagingTest {

    @Test
    void testLoadClass() {

        Assertions.assertTrue(true);
    }

    @Test
    void testConstructor() {

        Paging paging = new Paging();
        assertEquals(1, paging.getPage());
        assertEquals(10, paging.getPageSize());
        assertEquals(0, paging.getTotal());
        assertEquals(1, paging.getTotalPage());
        assertEquals("id", paging.getSortBy());
        assertEquals("ASC", paging.getOrder());
    }
}
