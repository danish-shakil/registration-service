package com.levvel.service;

import com.levvel.model.UserModel;
import com.levvel.repo.UserRegistrationRepo;
import com.levvel.entity.UserEntity;
import org.apache.catalina.User;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

@Service
public class UserRegistrationService {

    @Autowired
    UserRegistrationRepo repo;

    public UserModel registerUser(UserEntity userEntity) throws InvocationTargetException, IllegalAccessException {
        UserEntity savedUser = repo.save(userEntity);
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userModel,savedUser);
        return userModel;
    }

    public UserModel findUserByEmail(String email) throws InvocationTargetException, IllegalAccessException {
        Optional<UserEntity> byId = repo.findById(email);

        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userModel,byId.get());

        return userModel;
    }
}
