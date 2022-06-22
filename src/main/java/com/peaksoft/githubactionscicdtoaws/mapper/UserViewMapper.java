package com.peaksoft.githubactionscicdtoaws.mapper;

import com.peaksoft.githubactionscicdtoaws.dto.UserResponse;
import com.peaksoft.githubactionscicdtoaws.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserViewMapper {

    public UserResponse viewUser(User user) {
        if (user == null) {
            return null;
        }
        UserResponse response = new UserResponse();
        if (user.getId() != null) {
            response.setId(user.getId());
        }
        response.setName(user.getName());
        response.setAge(user.getAge());
        return response;
    }

    public List<UserResponse> viewUsers(List<User> users) {
        List<UserResponse> responses = new ArrayList<>();
        for (User user : users) {
            responses.add(viewUser(user));
        }
        return responses;
    }
}
