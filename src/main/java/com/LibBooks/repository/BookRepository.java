package com.LibBooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.LibBooks.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
