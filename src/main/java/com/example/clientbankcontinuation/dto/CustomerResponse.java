package com.example.clientbankcontinuation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {

    private Long id;
    private String name;
    private int age;
    private String email;
    private String phone;
}