package com.knoldus.springboot.webfluxjjwt.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author shashi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class  AuthRequest {

    private String username;
    private String password;

}
