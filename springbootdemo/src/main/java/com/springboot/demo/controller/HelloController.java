package com.springboot.demo.controller;

import com.springboot.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class HelloController {
    static List<User> users = new ArrayList<>();

    static {

        users.add(new User(1, "Suresh", 1000));
        users.add(new User(2, "danny", 10000));
        users.add(new User(3, "Ajay", 2000));
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Java 8";
    }

    @GetMapping("/users")
    public List<User> allUsers() {
        return users;// Java Object
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        log.info("We are in getUser().");
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @GetMapping("/getUserByName")
    public User getUserByName(@RequestParam String name) {
        log.info("We are in getUser().");
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}

// Serialization : Java Object to be converted into JSON
// De-Serialization : JSON object converted into Java object
