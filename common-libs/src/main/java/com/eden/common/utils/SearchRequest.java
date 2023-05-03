package com.eden.common.utils;

import lombok.Data;

/**
 * Generic class for searching data.
 *
 * @param <T> criteria containing class
 */
@Data
public class SearchRequest<T> {

    private T criteria;
    private Paging paging;
}
