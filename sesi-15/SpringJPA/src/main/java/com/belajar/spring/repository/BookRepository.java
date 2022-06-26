package com.belajar.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.belajar.spring.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findAll();
	
	List<Book> findAllByWriter(String writer);
	
	Book findByIsbn(String isbn);
	
	Book findByTitle(String title);
	
	@Query(
		nativeQuery = true,
		value = "select * from book"
	)
	List<Book> findAllQueryNative();
	
	@Query(
			nativeQuery = true,
			value = "select * from book where writer = ?1"
	)
	List<Book> findAllByWriterQueryNative(String writer);
	
}
