package com.oktay.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oktay.models.Author;

/**
 * @author oktay
 *
 */
@Repository
@Transactional
public class AuthorDAOImpl implements AuthorDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addAuthor(Author author) {
		sessionFactory.getCurrentSession().saveOrUpdate(author);
	}

	@Override
	public Author getAuthor(Integer authorId) {
		return (Author) sessionFactory.getCurrentSession().get(Author.class, authorId);
	}
	
	@Override
	public Author updateAuthor(Author author) {
		sessionFactory.getCurrentSession().update(author);
		return author;
	}

	@Override
	public void deleteAuthor(Integer authorId) {
		Author author = (Author) sessionFactory.getCurrentSession().load(Author.class, authorId);
		if (null != author) {
			this.sessionFactory.getCurrentSession().delete(author);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Author> getAllAuthors() {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(Author.class);
		return cr.list();
	}


}
