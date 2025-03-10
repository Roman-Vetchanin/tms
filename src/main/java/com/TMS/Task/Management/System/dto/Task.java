package com.TMS.Task.Management.System.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Task {
    @JsonProperty("author")
    @Schema(description = "id автора задачи", example = "0")
    private Long author;
    @JsonProperty("pk")
    @Schema(description = "id задачи")
    private Long pk;
    @JsonProperty("executor")
    @Schema(description = "id исполнителя задачи")
    private Long executor;
    @JsonProperty("title")
    @Schema(description = "заголовок задачи")
    private String title;

}
