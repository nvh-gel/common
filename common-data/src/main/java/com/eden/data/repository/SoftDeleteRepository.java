package com.eden.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Abstract JPA repository support soft deleting.
 *
 * @param <T>  model data type
 * @param <I> model id data type
 */
@SuppressWarnings("unused")
@NoRepositoryBean
public interface SoftDeleteRepository<T, I> extends JpaRepository<T, I> {

    /**
     * Find all entities.
     *
     * @return list of entities
     */
    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.isDeleted = false")
    @NonNull
    List<T> findAll();

    /**
     * Find a single entity by id.
     *
     * @param id must not be {@literal null}. entity id to find
     * @return found entity
     */
    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.isDeleted = false and e.id = ?1")
    @NonNull
    Optional<T> findById(@NonNull I id);

    /**
     * Check if entity with {id} exists
     * @param id id to check
     * @return true if found, otherwise, false
     */
    @Transactional(readOnly = true)
    @NonNull
    default boolean exists(@NonNull I id) {
        return findById(id).isPresent();
    }

    /**
     * Soft delete an entity.
     *
     * @param id entity id to delete
     */
    @Transactional
    @Query("update #{#entityName} e set e.isDeleted = true where e.id = ?1")
    @Modifying
    void softDelete(@NonNull I id);

    /**
     * Find all entities including deleted ones.
     *
     * @return list of entities
     */
    @Transactional(readOnly = true)
    @NonNull
    @Query("select e from #{#entityName}")
    List<T> findAllIncludingDeleted();

    /**
     * Find a single entity by id including deleted one.
     *
     * @param id entity id to find
     * @return optional of found entity
     */
    @Transactional(readOnly = true)
    @NonNull
    @Query("select e from #{#entityName} where e.id = ?1")
    Optional<T> findIncludingDeleted(@NonNull I id);
}
