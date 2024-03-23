package com.eden.mapper;

import com.eden.common.utils.Paging;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagingMapperTest {

    private final PagingMapperImpl pagingMapper = new PagingMapperImpl();


    @Test
    void testPagingMapper() {
        Paging paging = null;
        Paging mapped = pagingMapper.toPaging(paging);

        assertEquals(1, mapped.getPage());
        assertEquals(10, mapped.getPageSize());
        assertEquals(1, mapped.getTotalPage());
        assertEquals("ASC", mapped.getOrder());
        assertEquals("id", mapped.getSortBy());

        paging = new Paging();
        paging.setPage(0);
        paging.setPageSize(20);
        paging.setTotalPage(3);
        paging.setOrder("ASC");
        paging.setSortBy("id");
        mapped = pagingMapper.toPaging(paging);
        assertEquals(0, mapped.getPage());
        assertEquals(20, mapped.getPageSize());
        assertEquals(3, mapped.getTotalPage());
        assertEquals("ASC", mapped.getOrder());
        assertEquals("id", mapped.getSortBy());
    }
}
