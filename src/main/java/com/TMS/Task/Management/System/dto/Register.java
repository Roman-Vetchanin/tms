package com.TMS.Task.Management.System.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Register {
    @Schema(description = "почта автора")
    private String email;
    @Schema(description = "пароль")
    private String password;
    @Schema(description = "имя")
    private String firstName;
    @Schema(description = "фамилия")
    private String lastName;
    @Schema(description = "роль")
    private Role role;
}
