package com.example.springRestApi.repository;

import com.example.springRestApi.model.Library;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LibraryRepository extends MongoRepository <Library,String> {
    Optional<Library >findByEmail(String email);
}
