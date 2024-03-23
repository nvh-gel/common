package com.eden.mapper;

import com.eden.common.viewmodel.BaseVM;
import com.eden.nosql.model.BaseDocument;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BaseDocMapperTest {

    static class TestDoc extends BaseDocument {}

    @Nested
    class TestDocMapper implements BaseDocMapper<BaseVM, TestDoc> {

        @Override
        public BaseVM toViewModel(TestDoc document) {
            return null;
        }

        @Override
        public TestDoc toDocument(BaseVM viewModel) {
            return null;
        }

        @Override
        public List<BaseVM> toViewModel(List<TestDoc> docs) {
            return null;
        }

        @Override
        public List<TestDoc> toDocument(List<BaseVM> viewModels) {
            return null;
        }

        @Override
        public Set<BaseVM> toViewModel(Set<TestDoc> docs) {
            return null;
        }

        @Override
        public Set<TestDoc> toDocument(Set<BaseVM> viewModels) {
            return null;
        }

        @Override
        public Iterable<BaseVM> toViewModel(Iterable<TestDoc> docs) {
            return null;
        }

        @Override
        public Iterable<TestDoc> toDocument(Iterable<BaseVM> viewModels) {
            return null;
        }

        @Override
        public void mapUpdate(TestDoc target, TestDoc source) {

        }

        @Test
        void testMapObjectIdToString() {
            ObjectId objectId = null;
            String id = this.mapObjectIdToString(objectId);
            assertNull(id);
            objectId = ObjectId.get();
            id = this.mapObjectIdToString(objectId);
            assertEquals(objectId.toString(), id);
        }

        @Test
        void testStringToObjectId() {
            String id = null;
            ObjectId objectId = this.mapStringToObjectId(id);
            assertNull(objectId);
            id = "123rsr";
            objectId = this.mapStringToObjectId(id);
            assertNull(objectId);
            ObjectId testObjectId = ObjectId.get();
            id = testObjectId.toString();
            objectId = this.mapStringToObjectId(id);
            assertEquals(testObjectId, objectId);
        }
    }
}
