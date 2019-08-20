package com.nlc.service;

import java.util.List;

import com.nlc.models.Book;

/**
 * @author oktay
 *
 */
public interface BookService {
	
	public void addBook(Book book);
	
	public Book getBook(Integer bookId);
	
	public Book updateBook(Integer BookId,Book book);

	public void deleteBook(Integer bookId);

	public List<Book> getAllBooks();
}
