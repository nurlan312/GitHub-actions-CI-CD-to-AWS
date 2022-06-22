package com.peaksoft.githubactionscicdtoaws.mapper;

import com.peaksoft.githubactionscicdtoaws.dto.UserRequest;
import com.peaksoft.githubactionscicdtoaws.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserEditMapper {

    public User createUser(UserRequest request) {
        if (request == null) {
            return null;
        }
        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());
        return user;
    }

    public User updateUser(User user, UserRequest request) {
        user.setName(request.getName());
        user.setAge(request.getAge());
        return user;
    }
}
