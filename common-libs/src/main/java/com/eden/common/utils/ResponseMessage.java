package com.eden.common.utils;

import lombok.Getter;

/**
 * Response message to client,
 */
@Getter
public enum ResponseMessage {

    SUCCESS("Request completed successfully."),
    ENTITY_CREATED("Request was accepted, returned creating result."),
    ENTITY_UPDATED("Request was accepted, returned updating result."),
    ENTITY_DELETED("Request was accepted, returned deleting result."),
    UPLOADED("File was uploaded successfully."),

    BAD_REQUEST("Request data is invalid."),
    UNAUTHORIZED("Request was not authenticated"),
    FORBIDDEN("Not have privilege to access this resource."),
    ENTITY_NOT_FOUND("Entity not found."),

    INTERNAL_ERROR("Internal error."),
    UNPROCESSABLE_ENTITY("Cannot process for requested entity."),
    ;
    private final String text;

    ResponseMessage(String text) {
        this.text = text;
    }
}
