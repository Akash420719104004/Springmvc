package com.example.springRestApi.controller;

import com.example.springRestApi.dto.BookDto;
import com.example.springRestApi.dto.LibraryDto;
import com.example.springRestApi.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @Autowired
    LibraryService libraryService;
    @PostMapping("/addmapping")
    public ResponseEntity<LibraryDto> adduser(@RequestBody LibraryDto libraryDto){
        LibraryDto libraryDto1= libraryService.addUser(libraryDto) ;
        return ResponseEntity.ok(libraryDto1);
    }
    @PostMapping("/add")
    public ResponseEntity<BookDto> adduser1(@RequestBody BookDto bookDto){
        BookDto bookDto1= libraryService.addUser1(bookDto) ;
        return ResponseEntity.ok(bookDto);
    }

}
