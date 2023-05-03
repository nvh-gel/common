package com.eden.mapper;

import com.eden.common.viewmodel.BaseVM;
import com.eden.nosql.model.BaseDocument;
import org.bson.types.ObjectId;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

/**
 * Abstract mapper for mongodb document and view model
 *
 * @param <D> mongodb document
 * @param <V> view model
 */
@SuppressWarnings("unused")
public interface BaseDocMapper<V extends BaseVM, D extends BaseDocument> {

    /**
     * Map a document to view model.
     *
     * @param document document data
     * @return view model of that document
     */
    @Mapping(target = "objectId", source = "id", qualifiedByName = "mapObjectIdToString")
    @Mapping(target = "id", ignore = true)
    V toViewModel(D document);

    /**
     * Map a view model to document.
     *
     * @param viewModel view model data
     * @return document data
     */
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "id", source = "objectId", qualifiedByName = "mapStringToObjectId")
    D toDocument(V viewModel);

    /**
     * Map multiple documents to view models.
     *
     * @param docs document to map
     * @return collection of view models
     */
    List<V> toViewModel(List<D> docs);

    /**
     * Map multiple view models to documents
     *
     * @param viewModels view models to maps
     * @return collection of document
     */
    List<D> toDocument(List<V> viewModels);

    /**
     * Map multiple documents to view models.
     *
     * @param docs document to map
     * @return collection of view models
     */
    Set<V> toViewModel(Set<D> docs);

    /**
     * Map multiple view models to documents
     *
     * @param viewModels view models to maps
     * @return collection of document
     */
    Set<D> toDocument(Set<V> viewModels);

    /**
     * Map multiple documents to view models.
     *
     * @param docs document to map
     * @return collection of view models
     */
    Iterable<V> toViewModel(Iterable<D> docs);

    /**
     * Map multiple view models to documents
     *
     * @param viewModels view models to maps
     * @return collection of document
     */
    Iterable<D> toDocument(Iterable<V> viewModels);

    /**
     * Map a single document to the one that need updating.
     *
     * @param target document to update
     * @param source update data
     */
    void mapUpdate(@MappingTarget D target, D source);

    /**
     * Map object id to string.
     *
     * @param objectId object id
     * @return object id string
     */
    @Named("mapObjectIdToString")
    default String mapObjectIdToString(ObjectId objectId) {
        return null != objectId ? objectId.toString() : null;
    }

    /**
     * Map a string to object id.
     *
     * @param string string to map
     * @return objectId object if valid, else null
     */
    @Named("mapStringToObjectId")
    default ObjectId mapStringToObjectId(String string) {
        return ObjectId.isValid(string) ? new ObjectId(string) : null;
    }

}
