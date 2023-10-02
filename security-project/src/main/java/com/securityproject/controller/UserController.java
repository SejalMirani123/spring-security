package com.securityproject.controller;

import com.securityproject.models.User;
import com.securityproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //all users
    @GetMapping("/")
    public List<User> getAllusers() {
        return this.userService.getallUser();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

    @PostMapping("/")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }

}
