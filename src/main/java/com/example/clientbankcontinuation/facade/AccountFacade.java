package com.example.clientbankcontinuation.facade;

import com.example.clientbankcontinuation.dto.AccountRequest;
import com.example.clientbankcontinuation.dto.AccountResponse;
import com.example.clientbankcontinuation.model.Account;
import com.example.clientbankcontinuation.service.AccountService;
import com.example.clientbankcontinuation.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountFacade {

    private final AccountService service;
    private final ModelMapper mapper;
    private final NotificationService notificationService;

    public AccountFacade(AccountService service,
                         ModelMapper mapper,
                         NotificationService notificationService) {
        this.service = service;
        this.mapper = mapper;
        this.notificationService = notificationService;
    }

    public AccountResponse create(AccountRequest request) {
        log.info("Facade: creating account");

        Account account = mapper.map(request, Account.class);

        Account saved = service.save(account, request.getCustomerId());

        notificationService.sendAccountUpdate("Account created with id: " + saved.getId());

        return mapper.map(saved, AccountResponse.class);
    }
}