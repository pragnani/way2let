package com.mobjax.way2let.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobjax.way2let.entity.User;
import com.mobjax.way2let.repository.UserRepository;

@Service
public class InitDbService {

	@Autowired
	UserRepository userRepository;
	
	
	@PostConstruct
	private void init()
	{
		User user = new User();
		user.setStrFullName("Pragnani");
		user.setCityId(1);
		user.setCountryId(1);
		user.setDealings("dealings");
		user.setRoleId(1);
		user.setStrArea("Vijayawada");
		user.setStrEmail("pragnani@gmail.com");
		user.setStrMobileNo("9866166676");
		user.setStrOccupation("Student");
		user.setStrReferrer("nani");
		userRepository.save(user);
		
		
	}
	
}
