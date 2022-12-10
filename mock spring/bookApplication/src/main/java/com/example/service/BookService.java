package com.example.service;

import java.util.List;

import com.example.bean.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public Book createBook(Book book);
	public Book deleteBook(int id);
	public Book updateBook(Book book , int id);
}
