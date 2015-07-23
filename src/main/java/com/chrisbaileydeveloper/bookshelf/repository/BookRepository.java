package com.chrisbaileydeveloper.bookshelf.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chrisbaileydeveloper.bookshelf.domain.Book;

/**
 * Spring Data MongoDB repository for the Book entity.
 */
public interface BookRepository extends MongoRepository<Book,String> {
	 Book findOneById(String id);
	 
	 List<Book> findAll();
	 
	 void delete(Book b);
	 
	 void deleteAll();
}