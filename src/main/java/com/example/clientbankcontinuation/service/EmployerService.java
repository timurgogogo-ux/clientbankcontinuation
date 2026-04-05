package com.example.clientbankcontinuation.service;

import com.example.clientbankcontinuation.model.Employer;
import com.example.clientbankcontinuation.repository.EmployerRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployerService {

    private final EmployerRepository repository;

    public EmployerService(EmployerRepository repository) {
        this.repository = repository;
    }

    public Employer save(Employer employer) {
        return repository.save(employer);
    }
}