package com.belajar.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.spring.entity.Item;
import com.belajar.spring.repository.ItemRepository;
import com.belajar.spring.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<Item> findAllItem() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public Item findByIdItem(Integer id) {
		// TODO Auto-generated method stub
		Item item = itemRepository.findById(id).orElse(new Item());
		return item;
	}

	@Override
	public void deleteItem(Integer id) {
		// TODO Auto-generated method stub
		Item item = itemRepository.findById(id).orElse(new Item());
		itemRepository.delete(item);
	} 
}
