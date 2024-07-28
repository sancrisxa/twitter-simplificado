package com.sancrisxa.spring_security.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
