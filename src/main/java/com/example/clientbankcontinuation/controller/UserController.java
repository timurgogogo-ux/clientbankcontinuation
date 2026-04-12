package com.example.clientbankcontinuation.controller;

import com.example.clientbankcontinuation.model.User;
import com.example.clientbankcontinuation.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.save(user);
    }
}