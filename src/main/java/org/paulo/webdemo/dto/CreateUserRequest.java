package org.paulo.webdemo.dto;

import lombok.Data;

@Data
public class CreateUserRequest {

    private String username;
    private String confirmUsername;
    private String password;
    private String confirmPassword;

    public CreateUserRequest() {}

    public CreateUserRequest(String username, String confirmUsername, String password, String confirmPassword) {
        this.username = username;
        this.confirmUsername = confirmUsername;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
