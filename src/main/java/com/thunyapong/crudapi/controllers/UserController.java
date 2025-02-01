package com.thunyapong.crudapi.controllers;

import com.thunyapong.crudapi.entity.User;
import com.thunyapong.crudapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.findAll();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User myUser = userService.findById(id);
        if (myUser == null){
            throw new RuntimeException("User not found" + id);
        }
        return myUser;
    }
    @DeleteMapping("users/{id}")
    public String deleteUser(@PathVariable int id){
        User myUser = userService.findById(id);
        if(myUser == null){
            throw new RuntimeException("User not found " + id);
        }
        userService.deleteById(id);
        return "User deleted";
    }
    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }
}
