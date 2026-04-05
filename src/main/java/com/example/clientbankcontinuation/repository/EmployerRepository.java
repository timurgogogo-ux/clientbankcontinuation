package com.example.clientbankcontinuation.repository;

import com.example.clientbankcontinuation.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
}