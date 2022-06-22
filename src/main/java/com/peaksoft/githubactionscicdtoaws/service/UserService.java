package com.peaksoft.githubactionscicdtoaws.service;

import com.peaksoft.githubactionscicdtoaws.dto.UserRequest;
import com.peaksoft.githubactionscicdtoaws.dto.UserResponse;
import com.peaksoft.githubactionscicdtoaws.mapper.UserEditMapper;
import com.peaksoft.githubactionscicdtoaws.mapper.UserViewMapper;
import com.peaksoft.githubactionscicdtoaws.model.User;
import com.peaksoft.githubactionscicdtoaws.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserEditMapper editMapper;
    private final UserViewMapper viewMapper;

    public UserResponse createUser(UserRequest request) {
        User user = editMapper.createUser(request);
        repository.save(user);
        return viewMapper.viewUser(user);
    }

    public UserResponse updateUser(Long id, UserRequest request) {
        User user = repository.findById(id).get();
        editMapper.updateUser(user, request);
        return viewMapper.viewUser(repository.save(user));
    }
}
