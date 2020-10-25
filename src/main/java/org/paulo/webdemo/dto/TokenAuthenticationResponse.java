package org.paulo.webdemo.dto;

import lombok.Data;

@Data
public class TokenAuthenticationResponse {

    private boolean success;

    public TokenAuthenticationResponse() {}

    public TokenAuthenticationResponse(boolean success) {
        this.success = success;
    }
}
