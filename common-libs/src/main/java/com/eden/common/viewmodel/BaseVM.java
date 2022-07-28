package com.eden.common.viewmodel;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Abstract view model.
 */
@Data
public class BaseVM {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
