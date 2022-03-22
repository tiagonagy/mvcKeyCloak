package com.oauth2.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {


	
	public void processOAuthPostLogin(String username) {

		System.out.println("Created new user: " + username);

	}
	
}
