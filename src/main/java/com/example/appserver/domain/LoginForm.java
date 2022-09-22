package com.example.appserver.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginForm {
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
}
