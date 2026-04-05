package com.example.clientbankcontinuation.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.clientbankcontinuation.model.Account;
public interface AccountRepository extends JpaRepository<Account, Long> {
}
