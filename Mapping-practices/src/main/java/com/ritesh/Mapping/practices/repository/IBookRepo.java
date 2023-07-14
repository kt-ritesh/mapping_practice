package com.ritesh.Mapping.practices.repository;

import com.ritesh.Mapping.practices.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book, Long> {
}
