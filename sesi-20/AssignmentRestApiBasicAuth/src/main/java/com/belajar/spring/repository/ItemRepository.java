package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
