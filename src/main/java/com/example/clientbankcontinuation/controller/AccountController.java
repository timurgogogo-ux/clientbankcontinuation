package com.example.clientbankcontinuation.controller;

import com.example.clientbankcontinuation.dto.AccountRequest;
import com.example.clientbankcontinuation.dto.AccountResponse;
import com.example.clientbankcontinuation.facade.AccountFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@Slf4j
public class AccountController {

    private final AccountFacade facade;

    public AccountController(AccountFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public AccountResponse create(@RequestBody AccountRequest request) {

        log.info("Creating account for customerId: {}", request.getCustomerId());

        AccountResponse response = facade.create(request);

        log.info("Account created successfully with id: {}", response.getId());

        return response;
    }
}