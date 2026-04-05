package com.example.clientbankcontinuation.service;

import com.example.clientbankcontinuation.model.Customer;
import com.example.clientbankcontinuation.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public Page<Customer> getAll(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }
}