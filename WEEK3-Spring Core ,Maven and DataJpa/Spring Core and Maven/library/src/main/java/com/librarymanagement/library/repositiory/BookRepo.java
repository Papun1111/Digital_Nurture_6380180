package com.librarymanagement.library.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagement.library.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
