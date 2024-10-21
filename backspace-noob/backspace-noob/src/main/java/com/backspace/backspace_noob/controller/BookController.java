package com.backspace.backspace_noob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/getAllBooks")
    public String listagemDeLeleo(){
        return "leleo hahahah";
    }
}
