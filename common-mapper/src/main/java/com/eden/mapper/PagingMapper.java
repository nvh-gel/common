package com.eden.mapper;

import com.eden.common.utils.Paging;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * Interface define for mapping paging.
 */
@SuppressWarnings("unused")
@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PagingMapper {

    /**
     * Map input paging to a paging for querying.
     *
     * @param paging paging to map
     * @return mapped paging
     */
    Paging toPaging(Paging paging);
}
