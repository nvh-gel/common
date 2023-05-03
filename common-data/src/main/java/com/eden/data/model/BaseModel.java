package com.eden.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Abstract data model.
 */
@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private UUID uuid;
    @Column(columnDefinition = "boolean DEFAULT false")
    private boolean isDeleted;
    @Column(columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;
    @Column(columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;
}
