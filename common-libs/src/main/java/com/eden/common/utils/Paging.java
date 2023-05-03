package com.eden.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Data paging.
 */
@Data
@AllArgsConstructor
public class Paging {

    private int page;
    private int pageSize;
    private int total;
    private int totalPage;
    private String sortBy;
    private String order;

    /**
     * Constructor.
     */
    public Paging() {
        this.page = 1;
        this.pageSize = 10;
        this.total = 0;
        this.totalPage = 1;
        this.sortBy = "id";
        this.order = "ASC";
    }

    /**
     * Map a paging object from another, null checking and assigning default values.
     *
     * @param paging source paging
     * @return paging data
     */
    @SuppressWarnings("unused")
    public static Paging fromPaging(Paging paging) {
        Paging newPage = new Paging();
        if (paging == null) {
            return newPage;
        }
        if (paging.getPage() > 0) {
            newPage.setPage(paging.getPage());
        }
        if (paging.getPageSize() > 0) {
            newPage.setPageSize(paging.getPageSize());
        }
        newPage.setTotal(paging.getTotal());
        if (paging.getTotalPage() > 0) {
            newPage.setTotalPage(paging.getTotalPage());
        }
        if (!StringUtils.isEmpty(paging.getSortBy())) {
            newPage.setSortBy(paging.getSortBy());
        }
        if (!StringUtils.isEmpty(paging.getOrder())) {
            newPage.setOrder(paging.getOrder());
        }
        return newPage;
    }
}
