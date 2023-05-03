package com.eden.nosql.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Abstract class to contain basic information for mongodb document.
 */
@Getter
@Setter
public abstract class BaseDocument {

    @Id
    private ObjectId id;
    private UUID uuid;
    private boolean isDeleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
