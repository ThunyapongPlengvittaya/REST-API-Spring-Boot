package com.thunyapong.crudapi.services;

import com.thunyapong.crudapi.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
}
