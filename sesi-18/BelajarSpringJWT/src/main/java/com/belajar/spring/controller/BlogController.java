package com.belajar.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.spring.model.Blog;
import com.belajar.spring.repository.BlogRepository;

@RestController
public class BlogController {

	final private BlogRepository blogRepository;
	
	public BlogController(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}
	
	@GetMapping("/blog")
	public List<Blog> index(){
		return blogRepository.findAll();
	}
	
	@GetMapping("/blog/{id}")
	public Blog show(@PathVariable String id){
		int blogId = Integer.parseInt(id);
		return blogRepository.findById(blogId).orElse(new Blog());
	}
	
	@PostMapping("/blog/search")
	public List<Blog> search(@RequestBody Map<String, String>body){
		String searchTerm = body.get("text");
		return blogRepository.findByTitleContainingOrContentContaining(searchTerm,searchTerm);
	}
	
	@PostMapping("/blog")
	public Blog create(@RequestBody Map<String, String>body){
		String title = body.get("title");
		String content = body.get("content");
		String author = body.get("author");
		return blogRepository.save(new Blog(title, content, author));
	}
	
	@PutMapping("/blog/{id}")
	public Blog update(@PathVariable String id, @RequestBody Map<String, String>body){
		int blogId = Integer.parseInt(id);
		
		Blog blog = blogRepository.findById(blogId).orElse(new Blog());
		
		blog.setTitle(body.get("title"));
		blog.setContent(body.get("content"));
		blog.setAuthor(body.get("author"));
		
		return blogRepository.save(blog);
	}
	
	@DeleteMapping("/blog/{id}")
	public String delete(@PathVariable String id){
		int blogId = Integer.parseInt(id);
		blogRepository.deleteById(blogId);
		String msg = "Data berhasil dihapus";
		return msg;
	}
}
