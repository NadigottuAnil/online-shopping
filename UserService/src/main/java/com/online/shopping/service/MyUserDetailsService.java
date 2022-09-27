package com.online.shopping.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.online.shopping.model.UserData;


public interface MyUserDetailsService extends UserDetailsService {

	public UserData register(UserData userDetails);
	public UserData login(UserData userDetails);
}
