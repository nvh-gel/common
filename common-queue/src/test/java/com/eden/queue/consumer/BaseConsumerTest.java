package com.eden.queue.consumer;

import com.eden.common.viewmodel.BaseVM;
import com.eden.queue.util.QueueMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseConsumerTest {

    static class TestConsumer extends BaseConsumer<BaseVM> {

        @Override
        public void processMessage(QueueMessage<BaseVM> message) {
        }
    }

    @Test
    void testLoadClass() {

        TestConsumer testConsumer = new TestConsumer();
        assertNotNull(testConsumer);
    }
}
