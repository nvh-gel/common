package com.eden.common.viewmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Abstract view model.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseVM {

    private Long id;
    private String objectId;
    private UUID uuid;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
