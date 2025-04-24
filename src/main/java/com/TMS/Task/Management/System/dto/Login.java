package com.TMS.Task.Management.System.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Login {
    @Schema(description = "пароль")
    private String password;
    @Schema(description = "логин (email)")
    private String email;
}
