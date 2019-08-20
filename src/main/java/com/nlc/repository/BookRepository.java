package com.nlc.repository;

import org.springframework.data.repository.CrudRepository;

import com.nlc.models.Book;

/**
 * @author oktay
 *
 */
public interface BookRepository extends CrudRepository<Book, Integer>{

}
