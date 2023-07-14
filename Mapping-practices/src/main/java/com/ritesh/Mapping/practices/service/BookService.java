package com.ritesh.Mapping.practices.service;

import com.ritesh.Mapping.practices.model.Book;
import com.ritesh.Mapping.practices.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {

        bookRepo.save(book);
        return "New book added";
    }

    public String deleteBookById(Long id) {
        bookRepo.deleteById(id);

        return "One book deleted";
    }

    public Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Optional<Book> getBookById(Long id) {

        return bookRepo.findById(id);
    }
}
