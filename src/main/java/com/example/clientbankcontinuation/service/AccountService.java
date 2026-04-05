package com.example.clientbankcontinuation.service;

import com.example.clientbankcontinuation.model.Account;
import com.example.clientbankcontinuation.model.Customer;
import com.example.clientbankcontinuation.repository.AccountRepository;
import com.example.clientbankcontinuation.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository repository;
    private final CustomerRepository customerRepository;

    public AccountService(AccountRepository repository,
                          CustomerRepository customerRepository) {
        this.repository = repository;
        this.customerRepository = customerRepository;
    }

    public Account save(Account account, Long customerId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow();

        account.setCustomer(customer);
        return repository.save(account);
    }
}