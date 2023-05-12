package com.eden.mapper;

import com.eden.common.viewmodel.BaseVM;
import com.eden.data.model.BaseModel;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

/**
 * Abstract mapper.
 *
 * @param <M> model type
 * @param <V> view model type
 */
@SuppressWarnings("unused")
public interface BaseMapper<V extends BaseVM, M extends BaseModel> {

    /**
     * Map single model to view model.
     *
     * @param model model to map
     * @return view model
     */
    @Mapping(target = "objectId", ignore = true)
    V toViewModel(M model);

    /**
     * Map single view model to model
     *
     * @param viewModel view model to map
     * @return model
     */
    @Mapping(target = "deleted", ignore = true)
    M toModel(V viewModel);

    /**
     * Map list of models to view models.
     *
     * @param models models to map
     * @return list of view models
     */
    List<V> toViewModel(List<M> models);

    /**
     * Map list of view models.
     *
     * @param viewModels view models to map
     * @return list of models
     */
    List<M> toModel(List<V> viewModels);

    /**
     * Map multiple models to view models.
     *
     * @param models models to map
     * @return view models
     */

    Set<V> toViewModel(Set<M> models);

    /**
     * Map multiple view models.
     *
     * @param viewModels view models to map
     * @return models
     */
    Set<M> toModel(Set<V> viewModels);

    /**
     * Map multiple models to view models.
     *
     * @param models models to map
     * @return view models
     */
    Iterable<V> toViewModel(Iterable<M> models);

    /**
     * Map multiple view models.
     *
     * @param viewModels view models to map
     * @return models
     */
    Iterable<M> toModel(Iterable<V> viewModels);

    /**
     * Map updated field to an article model.
     *
     * @param model  article to update
     * @param update update data
     */
    void mapUpdate(@MappingTarget M model, M update);

    /**
     * Map a model to model id.
     *
     * @param model model to map
     * @return model id
     */
    @Named("modelToModelId")
    default Long modelToModelId(BaseModel model) {
        return model == null ? null : model.getId();
    }
}
