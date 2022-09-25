package com.poc.lms.service.impl;

import com.poc.lms.model.User;
import com.poc.lms.repository.UserRepository;
import com.poc.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User users) {
        return userRepository.save(users);
    }
}
