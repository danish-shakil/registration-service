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
        System.out.println("test");
        System.out.println("test");
        return service.registerUser(user);
    }

    @GetMapping(value = "/users/{email}")
    public UserModel findUser(@PathVariable String email) throws InvocationTargetException, IllegalAccessException {
        return service.findUserByEmail(email);
    }

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("here in the test endpoint !------!");
        return "Testing 123... v2.1";
    }

}
