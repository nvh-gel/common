package com.eden.common.service;

import com.eden.common.viewmodel.BaseVM;

/**
 * Basic service definition
 *
 * @param <T> view model request data type
 */
@SuppressWarnings("unused")
public interface BaseService<T extends BaseVM> {

    /**
     * Create a record.
     *
     * @param request creation request data
     * @return created result
     */
    T create(T request);

    /**
     * Send message to queue to create data
     *
     * @param request creation request data
     * @return transaction uuid
     */
    String createOnQueue(T request);

    /**
     * Find all with paging.
     *
     * @param page page number
     * @param size page size
     * @return list of item by page
     */
    Iterable<T> findAll(int page, int size);

    /**
     * Find a record by id.
     *
     * @param id id to find
     * @return found record
     */
    T findById(Long id);

    /**
     * Update a record.
     *
     * @param request update request data
     * @return updated result
     */
    T update(T request);

    /**
     * Send message to queue to update data.
     *
     * @param request update request data
     * @return transaction uuid
     */
    String updateOnQueue(T request);

    /**
     * Mark a record as deleted.
     *
     * @param id id to delete
     * @return deletion result
     */
    T delete(Long id);

    /**
     * Send message to queue to delete.
     *
     * @param id id to delete
     * @return transaction uuid
     */
    String deleteOnQueue(Long id);
}
