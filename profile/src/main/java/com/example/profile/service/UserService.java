package com.example.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.profile.agent.WalletFeignClient;
import com.example.profile.domain.User;
import com.example.profile.repository.UserRepository;

import io.seata.spring.annotation.GlobalTransactional;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	@Autowired 
	WalletFeignClient walletClient;
	
	
	@GlobalTransactional
	public void doRegister() {
		User user = new User();
		
		user.setFullName("Allas Alal");
		
		walletClient.credit();
		
	}

}
