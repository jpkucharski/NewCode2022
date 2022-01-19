package com.peter.jwtsimple.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {

    private String jwtToken;
}
