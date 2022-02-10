package com.levvel.repo;

import com.levvel.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepo extends MongoRepository<UserEntity, String> {

}
