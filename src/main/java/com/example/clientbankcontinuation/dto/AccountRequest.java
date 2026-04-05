package com.example.clientbankcontinuation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRequest {

    private Double balance;
    private Long customerId;
}