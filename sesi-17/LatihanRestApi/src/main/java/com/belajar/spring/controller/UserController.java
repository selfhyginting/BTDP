package com.belajar.spring.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.belajar.spring.entity.User;
import com.belajar.spring.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("")
	public List<User> list(){
		return userService.listAllUser();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id){
		try {
			User user = userService.getUser(id);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<>("Data berhasil ditambah", HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody User user,
			@PathVariable Integer id){
		try {
			User existUser = userService.getUser(id);
			if (existUser == null) {
				return new ResponseEntity<>("Data tidak ditemukan", HttpStatus.NOT_FOUND);
			}
			user.setId(id);
			userService.saveUser(user);
			return new ResponseEntity<>("Data berhasil diupdate", HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>("Terjadi kesalahan"+e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		userService.deleteUser(id);
		return new ResponseEntity<>("Data berhasil dihapus", HttpStatus.OK);
	}
	
}
