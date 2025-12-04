package org.example.expert.domain.auth.dto.response;

import lombok.Getter;

@Getter
public class SignupResponse {

    private final String bearerToken;
    private final String message;
    private final int status;

    public SignupResponse(String message, int status, String bearerToken) {
        this.message = message;
        this.status = status;
        this.bearerToken = bearerToken;
    }

    public SignupResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }
}
