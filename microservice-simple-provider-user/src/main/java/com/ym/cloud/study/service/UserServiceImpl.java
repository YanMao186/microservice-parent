package com.ym.cloud.study.service;

import com.ym.cloud.study.entity.User;
import com.ym.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }
}
