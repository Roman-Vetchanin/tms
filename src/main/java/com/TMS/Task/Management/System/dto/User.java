package com.TMS.Task.Management.System.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class User {
    @Schema(description = "ID пользователя")
    private Long id;
    @Schema(description = "Имя пользователя")
    private String firstName;
    @Schema(description = "Фамилия пользователя")
    private String lastName;
    @Schema(description = "e-mail пользователя")
    private String email;
    @Schema(description = "Роль")
    private Role role;
}
