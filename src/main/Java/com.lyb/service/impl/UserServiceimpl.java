package com.lyb.service.impl;

import com.lyb.domain.User;
import com.lyb.domain.UserRepository;
import com.lyb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public String findPwdById(String id) {

        if(userRepository.findById(id).isPresent())
            return userRepository.findById(id).get().getPassword();
        else
        return null;
    }
}
