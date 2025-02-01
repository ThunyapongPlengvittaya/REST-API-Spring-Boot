package com.thunyapong.crudapi.controllers;

import com.thunyapong.crudapi.entity.User;
import com.thunyapong.crudapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        user.setId(0);
        return userService.save(user);
    }
}
