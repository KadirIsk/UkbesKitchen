package com.worldwide.UkbesKitchen.controller;

import com.worldwide.UkbesKitchen.entity.User;
import com.worldwide.UkbesKitchen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/getAllUsers")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping(path = "/getUserById")
    public User getUserById(@RequestParam String id) {
        return userRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/getUsersByUserName", method = RequestMethod.GET)
    public List<User> getUsersByUserName(@RequestParam String userName) {
        return userRepository.findByUserName(userName);
    }

    @GetMapping(path = "/getActiveUsers")
    public List<User> getActiveUsers() {
        return userRepository.findByIsActiveTrue();
    }

    @GetMapping(path = "/getInActiveUsers")
    public List<User> getInActiveUsers() {
        return userRepository.findByIsActiveFalse();
    }
}
