package com.eden.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Data paging.
 */
@Data
@AllArgsConstructor
public class Paging {

    private Integer page;
    private Integer pageSize;
    private Integer total;
    private Integer totalPage;
    private String sortBy;
    private String order;

    /**
     * Constructor.
     */
    public Paging() {
        this(1, 10, 0, 1, "id", "ASC");
    }
}
