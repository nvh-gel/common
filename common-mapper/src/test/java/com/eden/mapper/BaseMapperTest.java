package com.eden.mapper;

import com.eden.common.viewmodel.BaseVM;
import com.eden.data.model.BaseModel;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BaseMapperTest {

    static class TestBaseModel extends BaseModel {
    }

    @Nested
    class TestMapperClass implements BaseMapper<BaseVM, BaseModel> {

        @Override
        public BaseVM toViewModel(BaseModel model) {
            return null;
        }

        @Override
        public BaseModel toModel(BaseVM viewModel) {
            return null;
        }

        @Override
        public List<BaseVM> toViewModel(List<BaseModel> models) {
            return null;
        }

        @Override
        public List<BaseModel> toModel(List<BaseVM> viewModels) {
            return null;
        }

        @Override
        public Set<BaseVM> toViewModel(Set<BaseModel> models) {
            return null;
        }

        @Override
        public Set<BaseModel> toModel(Set<BaseVM> viewModels) {
            return null;
        }

        @Override
        public Iterable<BaseVM> toViewModel(Iterable<BaseModel> models) {
            return null;
        }

        @Override
        public Iterable<BaseModel> toModel(Iterable<BaseVM> viewModels) {
            return null;
        }

        @Override
        public void mapUpdate(BaseModel model, BaseModel update) {

        }

        @Test
        public void testMapToModelIdToId() {
            BaseModel testModel = null;
            Long id = this.modelToModelId(testModel);
            assertNull(id);
            testModel = new TestBaseModel();
            testModel.setId(123L);
            id = this.modelToModelId(testModel);
            assertEquals(123L, id);
        }
    }
}
