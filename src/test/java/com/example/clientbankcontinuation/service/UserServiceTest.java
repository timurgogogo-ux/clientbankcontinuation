package com.example.clientbankcontinuation.service;

import com.example.clientbankcontinuation.model.User;
import com.example.clientbankcontinuation.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void shouldEncodePassword() {

        UserRepository repo = Mockito.mock(UserRepository.class);
        PasswordEncoder encoder = Mockito.mock(PasswordEncoder.class);

        Mockito.when(encoder.encode("1234")).thenReturn("encoded123");

        UserService service = new UserService(repo, encoder);

        User user = new User();
        user.setUsername("test");
        user.setPassword("1234");

        service.save(user);

        assertEquals("encoded123", user.getPassword());
    }
}