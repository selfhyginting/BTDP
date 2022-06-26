package com.belajar.spring;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.entity.Book;
import com.belajar.spring.entity.BookCategory;
import com.belajar.spring.entity.Course;
import com.belajar.spring.entity.Student;
import com.belajar.spring.repository.BookCategoryRepository;
import com.belajar.spring.repository.BookRepository;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;


@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner{
	
	private final Logger LOG = LoggerFactory.getLogger(SpringJpaApplication.class);
		
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookCategoryRepository bookCategoryRepository; 
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		Book book1 = new Book();
//		book1.setTitle("Belajar Spring Boot");
//		book1.setWriter("Selfhy Ginting");
//		book1.setIsbn("IS-90908");
//		
//		Book book2 = new Book();
//		book2.setTitle("Belajar Spring Boot 2");
//		book2.setWriter("Teten Nugraha");
//		book2.setIsbn("IS-90907");
//		
//		bookRepository.save(book1);
//		bookRepository.save(book2);
//		
//		LOG.info("Berhasil menyimpan " +book1);
//		LOG.info("Berhasil menyimpan " +book2);
		
//		List<Book> books = bookRepository.findAll();
//		LOG.info("Books : "+books );
		
//		final String writer = "Teten Nugraha";
//		
//		List<Book> booksbywriter = bookRepository.findAllByWriter(writer);
//		LOG.info("Books : "+booksbywriter);
		
//		final String isbn = "IS-90908";
//		
//		Book book = bookRepository.findByIsbn(isbn);
//		
//		LOG.info("Book : "+book);

//----------------------------------------------------------------- By Query Native

//		List<Book> books = bookRepository.findAllQueryNative();
//		LOG.info("Book : " +books);
		
//		final String writer = "Selfhy Ginting";
//		
//		List<Book> books = bookRepository.findAllByWriterQueryNative(writer);
//		LOG.info("Book : " +books);
		
//----------------------------------------------------------------BookRepository & Book => Many To One
//		BookCategory bookCategory = bookCategoryRepository
//				.save(new BookCategory("Programming", new Book("Java 1","Teten N.","SEI92002"), new Book("Java 2","Selfhy G.","UE08I829")));
//		
//		LOG.info("BookCategory : "+bookCategory);
		
//----------------------------------------------------------------Student & Course => Many to Many Run
		Student student = new Student("Selfhy", 21);
		
		studentRepository.save(student);
		
		Course course1 = new Course("Back End Development",12,1500);
		Course course2 = new Course("Automated Testing",8,800);
		
		courseRepository.saveAll(Arrays.asList(course1, course2));
		
		student.getCourses().addAll(Arrays.asList(course1,course2));
		
		studentRepository.save(student);
	}

}
