package com.eden.common.producer;

import com.eden.common.utils.Action;
import com.eden.common.utils.QueueMessage;

import java.util.UUID;

/***
 * Generic message producer.
 *
 * @param <T> VM to send to queue
 */
@SuppressWarnings("unused")
public interface BaseProducer<T> {

    /***
     * Send a message to queue.
     *
     * @param message message to send
     */
    void send(QueueMessage<T> message);

    /**
     * Craft a message and send to queue.
     *
     * @param action  action to process {CREATE, UPDATE, DELETE}
     * @param request request data
     * @return transaction uuid
     */
    default String sendProcessingMessageToQueue(Action action, T request) {

        UUID uuid = UUID.randomUUID();
        QueueMessage<T> message = new QueueMessage<>(action, uuid, request);
        send(message);
        return uuid.toString();
    }
}
