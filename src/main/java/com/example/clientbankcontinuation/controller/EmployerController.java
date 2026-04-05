package com.example.clientbankcontinuation.controller;

import com.example.clientbankcontinuation.facade.EmployerFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.clientbankcontinuation.dto.EmployerRequest;
import com.example.clientbankcontinuation.dto.EmployerResponse;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/employers")

public class EmployerController {

    private final EmployerFacade facade;

    public EmployerController(EmployerFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public EmployerResponse create(@Valid @RequestBody EmployerRequest request) {
        return facade.create(request);
    }
}