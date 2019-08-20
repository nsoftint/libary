package com.nlc.service;

import java.util.List;

import com.nlc.models.Author;

/**
 * @author oktay
 *
 */
public interface AuthorService {
	
	public void addAuthor(Author author);	
	
	public Author getAuthor(Integer authorId);
	
	public Author updateAuthor(Integer authorId, Author author);
	
	public void deleteAuthor(Integer authorId);
			
	public List<Author> getAllAuthors();
}
