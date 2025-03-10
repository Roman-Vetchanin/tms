package com.TMS.Task.Management.System.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreateOrUpdateTask {
    @Schema(description = "описание задачи")
    private String description;
    @Schema(description = "статус задачи", example = "FINISHED")
    private Status status;
    @Schema(description = "приоритет", example = "LOW")
    private Priority priority;
}
