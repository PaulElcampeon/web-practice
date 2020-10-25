package org.paulo.webdemo.services;

import org.paulo.webdemo.dto.AuthenticationRequest;
import org.paulo.webdemo.dto.AuthenticationResponse;
import org.paulo.webdemo.dto.CreateUserRequest;

public interface UserService {

    boolean createUserLvRestricted(CreateUserRequest createUserRequest) throws Exception;

    boolean createUserLvView(CreateUserRequest createUserRequest) throws Exception;

    boolean createUserLvEdit(CreateUserRequest createUserRequest) throws Exception;

    AuthenticationResponse authenticateUser(AuthenticationRequest loginMessage) throws Exception;

    boolean checkIfUsernameExists(String username);

    void removeUser(String useId);
}
