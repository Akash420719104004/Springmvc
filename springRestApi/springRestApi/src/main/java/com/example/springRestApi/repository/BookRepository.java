package com.example.springRestApi.repository;

import com.example.springRestApi.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,String> {
}
