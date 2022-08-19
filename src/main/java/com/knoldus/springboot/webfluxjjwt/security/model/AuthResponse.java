package com.knoldus.springboot.webfluxjjwt.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Shashikant
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthResponse {

    private String token;

}
