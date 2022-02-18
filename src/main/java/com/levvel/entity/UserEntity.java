package com.levvel.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@ToString
@Data
public class UserEntity {
    @Id
    private String email;
    private String password;
}
