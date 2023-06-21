package com.eden.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

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

    @ColumnDefault("FALSE")
    private boolean isDeleted;

    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;
}
