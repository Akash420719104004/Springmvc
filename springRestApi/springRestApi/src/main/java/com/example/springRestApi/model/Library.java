package com.example.springRestApi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "lib")
public class Library {
    @Id
    private String id;
    private String name;
    private String age;
    private String email;
    private String password;
}
