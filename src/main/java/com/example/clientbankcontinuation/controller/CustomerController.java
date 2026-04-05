package com.example.clientbankcontinuation.controller;

import com.example.clientbankcontinuation.dto.CustomerRequest;
import com.example.clientbankcontinuation.dto.CustomerResponse;
import com.example.clientbankcontinuation.facade.CustomerFacade;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerFacade facade;

    public CustomerController(CustomerFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public CustomerResponse create(@Valid @RequestBody CustomerRequest request) {
        return facade.create(request);
    }

    @GetMapping
    public Page<CustomerResponse> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return facade.getAll(page, size);
    }
}