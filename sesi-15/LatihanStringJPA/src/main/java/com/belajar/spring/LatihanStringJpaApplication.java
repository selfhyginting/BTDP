package com.belajar.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.entity.Address;
import com.belajar.spring.entity.User;
import com.belajar.spring.repository.AddressRepository;
import com.belajar.spring.repository.UserRepository;

@SpringBootApplication
public class LatihanStringJpaApplication implements CommandLineRunner{

	private final Logger LOG = LoggerFactory.getLogger(LatihanStringJpaApplication.class);
	
	@Autowired 
	private AddressRepository addressRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LatihanStringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user1 = new User();
		user1.setEmail("selfhy.ginting@bfi.co.id");
		user1.setName("Selfhy Ginting");
		user1.setPassword("passw0rd!");
		
		userRepository.save(user1);
		LOG.info("Berhasil menyimpan " +user1);
		
		
		Address address1 = new Address();
		address1.setCity("Medan");
		address1.setCountry("Selfhy Ginting");
		address1.setState("Sumatera Utara");
		address1.setStreet("Jalan Setiabudi");
		address1.setZip_code("1234");
		address1.setUser(user1);
		
		addressRepository.save(address1);
		LOG.info("Berhasil menyimpan " +address1);
	}

}
