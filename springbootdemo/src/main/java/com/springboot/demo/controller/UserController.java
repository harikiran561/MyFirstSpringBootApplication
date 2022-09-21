package com.springboot.demo.controller;

import com.springboot.demo.exception.NoUsersFoundException;
import com.springboot.demo.model.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User> users = userService.getAllUsers();
        if (users != null) {
            return users;
        } else {
            throw new NoUsersFoundException("No Users Present in DB");
        }
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        if (!Objects.isNull(user)) {
            return user;
        }else {
            throw new NoUsersFoundException("The given user not found");
        }
    }
}
