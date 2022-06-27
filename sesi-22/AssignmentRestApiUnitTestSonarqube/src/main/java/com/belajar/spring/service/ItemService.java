package com.belajar.spring.service;

import java.util.List;


import com.belajar.spring.entity.Item;


public interface ItemService {

	
	List<Item> findAllItem();

	Item saveItem(Item item); 
		
	Item findByIdItem(Integer id);
		
	void deleteItem(Integer id); 
	
}


