package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
	
}
