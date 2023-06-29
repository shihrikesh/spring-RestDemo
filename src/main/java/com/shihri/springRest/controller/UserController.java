package com.shihri.springRest.controller;

import com.shihri.springRest.services.UserService;
import com.shihri.springRest.model.UserRequest;
import com.shihri.springRest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{id}", produces = "Application/json")
    public ResponseEntity<User> getUser(@PathVariable Long id) {

        User user = userService.getUser(id).orElseThrow(NoSuchElementException::new);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping(value = "/users", produces = "Application/json")
    public ResponseEntity<User> saveUser(@RequestBody UserRequest userRequest) {
        User user = userService.saveUser(userRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
