package com.TMS.Task.Management.System.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Comment {
    @Schema(description = "id автора")
    private Long author;
    @Schema(description = "id задания")
    private Long pk;
    @Schema(description = "текст задачи")
    private String content;
    @Schema(description = "имя автора")
    private String authorFirstName;
    @Schema(description = "фамилия автора")
    private String authorLastName;
}
