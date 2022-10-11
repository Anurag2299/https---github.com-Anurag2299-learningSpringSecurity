package com.springsecurity.springbootsecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.springbootsecurity.models.User;
import com.springsecurity.springbootsecurity.services.UserService;

/**
 * UserController
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    //get all users
    @GetMapping("/")
    public List<User> getAllUser(){
         return this.userService.getAllUsers();
    }

    //return single User
    @GetMapping("/{name}")
    public User getUserByName(@PathVariable("name") String username){
        return this.userService.getUserByUsername(username);
    }
    
    //add user
    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }
}