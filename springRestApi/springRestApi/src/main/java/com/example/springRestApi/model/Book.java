package com.example.springRestApi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
public class Book {
    @Id
    private String id;
    private String name;
    @DocumentReference
    private Library library;

}
