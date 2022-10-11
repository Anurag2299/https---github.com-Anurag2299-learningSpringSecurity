package com.springsecurity.springbootsecurity.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springsecurity.springbootsecurity.models.User;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc","abc@w.com","abc"));
        list.add(new User("abc1","abc1@w.com","abc"));
        list.add(new User("abc2","abc@2w.com","abc"));
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUserByUsername(String name){
        return this.list.stream().filter((user) -> user.getUserName().equals(name)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

    
}
