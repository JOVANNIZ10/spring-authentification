package com.ivan.auth.auth_service.dto.response;

import java.util.UUID;

public  record UserResponse (
    UUID id,
    String email
){}
