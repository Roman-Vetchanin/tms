package com.TMS.Task.Management.System.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtendedTask {
    @Schema(description = "id таски")
    private Long pk;
    @Schema(description = "имя автора таски")
    private String authorFirstName;
    @Schema(description = "фамилия автора таски")
    private String authorLastName;
    @Schema(description = "описание таски")
    private String description;
    @Schema(description = "заголовок таски")
    private String title;
    @Schema(description = "статус такси")
    private Status status;
    @Schema(description = "приоритет таски")
    private Priority priority;

}
