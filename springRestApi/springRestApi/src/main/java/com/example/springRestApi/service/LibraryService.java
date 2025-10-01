package com.example.springRestApi.service;

import com.example.springRestApi.dto.BookDto;
import com.example.springRestApi.dto.LibraryDto;
import com.example.springRestApi.model.Book;
import com.example.springRestApi.model.Library;
import com.example.springRestApi.repository.BookRepository;
import com.example.springRestApi.repository.LibraryRepository;
import com.example.springRestApi.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository libraryRepository;
    @Autowired
    BookRepository bookRepository;
    public LibraryDto addUser(LibraryDto libraryDto) {
        Library library=new Library();
        library.setEmail(libraryDto.getEmail());
        library.setAge(libraryDto.getAge());
        library.setName(libraryDto.getName());
        library.setPassword(libraryDto.getPassword());
        libraryRepository.save(library);
        return libraryDto;
    }

    public BookDto addUser1(BookDto bookDto) {
        Book book=new Book();
        book.setName(bookDto.getName());
        book.setLibrary(libraryRepository.findById(bookDto.getLibraryId()).get());
        bookRepository.save(book);
        return bookDto;
    }

    public Optional<String> login(LoginRequest loginRequest) {
        return libraryRepository.findByEmail(loginRequest.getEmail()).map(library -> {
                    if (library.getPassword().equals(loginRequest.getPassword())) {
                        return "login";
                    } else {

                      return "Invalid";
                    }
                }
        );

    }
}
