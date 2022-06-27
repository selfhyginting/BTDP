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

import com.belajar.spring.entity.Item;
import com.belajar.spring.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@GetMapping("")
	public List<Item> list(){
		return itemService.findAllItem();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> get(@PathVariable Integer id){
		try {
			Item item = itemService.findByIdItem(id);
			return new ResponseEntity<Item>(item,HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody Item item) {
		itemService.saveItem(item);
		return new ResponseEntity<>("Data berhasil ditambah", HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Item item,
			@PathVariable Integer id){
		try {
			Item existItem = itemService.findByIdItem(id);
			if (existItem == null) {
				return new ResponseEntity<>("Data tidak ditemukan", HttpStatus.NOT_FOUND);
			}
			item.setId(id);
			itemService.saveItem(item);
			return new ResponseEntity<>("Data berhasil diupdate", HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>("Terjadi kesalahan"+e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		itemService.deleteItem(id);
		return new ResponseEntity<>("Data berhasil dihapus", HttpStatus.OK);
	}
}

