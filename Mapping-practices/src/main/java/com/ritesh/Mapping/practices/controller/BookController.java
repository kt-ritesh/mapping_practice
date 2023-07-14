package com.ritesh.Mapping.practices.controller;

import com.ritesh.Mapping.practices.model.Book;
import com.ritesh.Mapping.practices.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("book/{id}")
    String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }

    @GetMapping("books")
    Iterable<Book> getAllBooks(){

        return bookService.getAllBooks();
    }

    @GetMapping("book/{id}")
    Optional<Book> getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }
}
