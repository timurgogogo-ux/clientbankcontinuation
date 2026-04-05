package com.example.clientbankcontinuation.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployerRequest {

    @Size(min = 3)
    private String name;

    @Size(min = 3)
    private String address;
}