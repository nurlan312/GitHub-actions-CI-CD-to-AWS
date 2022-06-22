package com.peaksoft.githubactionscicdtoaws.controller;

import com.peaksoft.githubactionscicdtoaws.dto.UserRequest;
import com.peaksoft.githubactionscicdtoaws.dto.UserResponse;
import com.peaksoft.githubactionscicdtoaws.repository.UserRepository;
import com.peaksoft.githubactionscicdtoaws.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse create(UserRequest request) {
        return userService.createUser(request);
    }

    @PutMapping("/{id}")
    public UserResponse update(@PathVariable Long id, UserRequest request) {
        return userService.updateUser(id, request);
    }
}
