package com.belajar.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.belajar.spring.entity.Item;

public class TestObjectFactory {

	public static Item createItem() {
		  final Item item = new Item();
		  item.setId(new Random().nextInt());
		  item.setNama(RandomStringUtils.randomAlphabetic(10));
		  item.setHargaBeli(new Random().nextInt());
		  item.setHargaJual(new Random().nextInt());

		  return item;
		}

		public static List<Item> createItemList(final int size){
		  final List<Item> result = new ArrayList<>();
		  for(int i=0; i<size; i++) {
		    result.add(createItem());
		  }
		  return result;
		}
		
		
}
