package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{
	
	Boolean existsByUsername(String username);
	UserInfo findByUsername(String username);

}
