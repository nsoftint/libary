package com.nlc.repository;

import org.springframework.data.repository.CrudRepository;

import com.nlc.models.Author;

/**
 * @author oktay
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
