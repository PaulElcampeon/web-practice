package org.paulo.webdemo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

@Data
@Document(collection = "USERS")
public class User {

    @Id
    private String username;
    private String password;
    private List<String> roles;

    public User() {
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.roles = Arrays.asList(role);
    }
}
