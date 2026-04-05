package com.example.clientbankcontinuation.facade;

import com.example.clientbankcontinuation.dto.AccountRequest;
import com.example.clientbankcontinuation.dto.AccountResponse;
import com.example.clientbankcontinuation.model.Account;
import com.example.clientbankcontinuation.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AccountFacade {

    private final AccountService service;
    private final ModelMapper mapper;

    public AccountFacade(AccountService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public AccountResponse create(AccountRequest request) {
        Account account = mapper.map(request, Account.class);
        return mapper.map(
                service.save(account, request.getCustomerId()),
                AccountResponse.class
        );
    }
}