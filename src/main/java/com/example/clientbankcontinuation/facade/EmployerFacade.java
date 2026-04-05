package com.example.clientbankcontinuation.facade;

import com.example.clientbankcontinuation.dto.EmployerRequest;
import com.example.clientbankcontinuation.dto.EmployerResponse;
import com.example.clientbankcontinuation.model.Employer;
import com.example.clientbankcontinuation.service.EmployerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployerFacade {

    private final EmployerService service;
    private final ModelMapper mapper;

    public EmployerFacade(EmployerService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public EmployerResponse create(EmployerRequest request) {
        Employer employer = mapper.map(request, Employer.class);
        return mapper.map(service.save(employer), EmployerResponse.class);
    }
}