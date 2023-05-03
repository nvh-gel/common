package com.eden.queue.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Message config for queue.
 */
@SuppressWarnings("unused")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Strings {

    public static final String SEND_MESSAGE = "Send message {} to topic {}";
    public static final String RECEIVED_MESSAGE = "Received message {} from topic {}";
}
