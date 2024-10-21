package com.backspace.backspace_noob.controller;

import com.backspace.backspace_noob.model.Book;
import com.backspace.backspace_noob.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
