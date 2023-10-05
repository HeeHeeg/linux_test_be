package com.example.gcptest.controller;

import com.example.gcptest.domin.entity.User;
import com.example.gcptest.domin.request.UserRequest;
import com.example.gcptest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
@CrossOrigin("http://localhost:3000")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public void save(@RequestBody UserRequest request) {
        userService.save(request);
    }
}
