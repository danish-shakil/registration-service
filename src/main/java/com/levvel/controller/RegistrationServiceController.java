package com.levvel.controller;

import com.levvel.entity.UserEntity;
import com.levvel.model.UserModel;
import com.levvel.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/api")
public class RegistrationServiceController {

    @Autowired
    UserRegistrationService service;

    @PostMapping("/addUser")
    public UserModel registerUser(@RequestBody UserEntity user) throws InvocationTargetException, IllegalAccessException {
        return service.registerUser(user);
    }

    @GetMapping(value = "/users/{email}")
    public UserModel findUser(@PathVariable String email) throws InvocationTargetException, IllegalAccessException {
        return service.findUserByEmail(email);
    }

}
