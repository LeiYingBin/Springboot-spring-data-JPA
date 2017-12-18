package com.lyb.service;

import com.lyb.domain.User;

public interface UserService {

    User findById(String id);

    String findPwdById(String id);
}
