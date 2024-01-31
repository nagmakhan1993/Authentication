package com.JwtJpa.Authentication.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class JwtRequest {
    private String email;
    private String password;
}
