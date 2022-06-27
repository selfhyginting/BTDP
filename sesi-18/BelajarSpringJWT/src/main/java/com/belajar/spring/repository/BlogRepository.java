package com.belajar.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

}
