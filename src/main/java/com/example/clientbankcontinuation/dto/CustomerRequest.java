package com.example.clientbankcontinuation.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {

    @Size(min = 2)
    private String name;

    @Min(18)
    private int age;

    @Email
    private String email;

    @Pattern(regexp = "\\+?[0-9]{10,13}")
    private String phone;

    @Size(min = 8)
    private String password;
}