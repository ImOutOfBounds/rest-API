package com.backspace.backspace_noob.controller;


import com.backspace.backspace_noob.Dto.BookInfoDto;
import com.backspace.backspace_noob.model.BookModel;
import com.backspace.backspace_noob.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getAllBooks")
    public List<BookModel> getAllBooks(){
        return bookRepository.findAll();
    }

    @PostMapping("/addBook")
    public void BookInfoDto(@RequestBody BookInfoDto bookInfo){
    }
}
