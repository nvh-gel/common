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

    @Test
    void testCloningMethod() {

        Paging sourcePaging = null;
        Paging paging = Paging.fromPaging(sourcePaging);

        assertNotNull(paging);
        assertEquals(1, paging.getPage());
        assertEquals(10, paging.getPageSize());
        assertEquals(0, paging.getTotal());
        assertEquals(1, paging.getTotalPage());
        assertEquals("id", paging.getSortBy());
        assertEquals("ASC", paging.getOrder());

        sourcePaging = new Paging(1, 20, 1, 2, "createdAt", "ASC");
        paging = Paging.fromPaging(sourcePaging);

        assertEquals(sourcePaging.getPage(), paging.getPage());
        assertEquals(sourcePaging.getPageSize(), paging.getPageSize());
        assertEquals(sourcePaging.getTotal(), paging.getTotal());
        assertEquals(sourcePaging.getTotalPage(), paging.getTotalPage());
        assertEquals(sourcePaging.getSortBy(), paging.getSortBy());
        assertEquals(sourcePaging.getOrder(), paging.getOrder());
    }
}
