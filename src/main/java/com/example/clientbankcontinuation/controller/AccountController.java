package com.example.clientbankcontinuation.controller;

import com.example.clientbankcontinuation.dto.AccountRequest;
import com.example.clientbankcontinuation.dto.AccountResponse;
import com.example.clientbankcontinuation.facade.AccountFacade;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountFacade facade;

    public AccountController(AccountFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public AccountResponse create(@RequestBody AccountRequest request) {
        return facade.create(request);
    }
}