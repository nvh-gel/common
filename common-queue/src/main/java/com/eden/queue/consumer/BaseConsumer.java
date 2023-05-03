package com.eden.queue.consumer;

import com.eden.common.viewmodel.BaseVM;
import com.eden.queue.util.Action;
import com.eden.queue.util.QueueMessage;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 * Abstract consumer.
 *
 * @param <T> Type of data view model to consume
 */
@SuppressWarnings("unused")
public abstract class BaseConsumer<T extends BaseVM> {

    protected final Map<Action, UnaryOperator<T>> actionMap = new EnumMap<>(Action.class);

    /**
     * Process a message received from queue.
     *
     * @param message message data
     */
    @SuppressWarnings("unused")
    public abstract void processMessage(QueueMessage<T> message);

    /**
     * Default processing message by stored action map.
     *
     * @param message received queue message
     */
    public void processByActionMap(QueueMessage<T> message) {

        UnaryOperator<T> action = actionMap.getOrDefault(message.getAction(), null);
        if (null != action) {
            action.apply(message.getMessage());
        }
    }
}
