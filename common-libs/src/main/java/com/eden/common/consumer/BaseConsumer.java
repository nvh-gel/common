package com.eden.common.consumer;

import com.eden.common.utils.Action;
import com.eden.common.utils.QueueMessage;
import com.eden.common.viewmodel.BaseVM;

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
}
