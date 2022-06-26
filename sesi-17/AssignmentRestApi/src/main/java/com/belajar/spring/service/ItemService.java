package com.belajar.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.spring.entity.Item;
import com.belajar.spring.repository.ItemRepository;

@Service
@Transactional
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> listAllItem(){
		return itemRepository.findAll();
		
	}
	
	public void saveItem(Item item) {
		itemRepository.save(item);
	}
	
	public Item getItem(Integer id) {
		return itemRepository.findById(id).get();
	}
	
	public void deleteItem(Integer id) {
		itemRepository.deleteById(id);
	}
}


