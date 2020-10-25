package org.paulo.webdemo.dto;

import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;
    private int restrictionLevel = 1;

    public AuthenticationResponse() {}

    public AuthenticationResponse(String jwt, int restrictionLevel) {
        this.jwt = jwt;
        this.restrictionLevel = restrictionLevel;
    }
}
