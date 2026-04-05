package com.example.clientbankcontinuation.facade;

import com.example.clientbankcontinuation.dto.CustomerRequest;
import com.example.clientbankcontinuation.dto.CustomerResponse;
import com.example.clientbankcontinuation.model.Customer;
import com.example.clientbankcontinuation.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class CustomerFacade {

    private final CustomerService service;
    private final ModelMapper mapper;

    public CustomerFacade(CustomerService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public CustomerResponse create(CustomerRequest request) {
        Customer customer = mapper.map(request, Customer.class);
        Customer saved = service.save(customer);
        return mapper.map(saved, CustomerResponse.class);
    }

    public Page<CustomerResponse> getAll(int page, int size) {
        return service.getAll(page, size)
                .map(c -> mapper.map(c, CustomerResponse.class));
    }
}