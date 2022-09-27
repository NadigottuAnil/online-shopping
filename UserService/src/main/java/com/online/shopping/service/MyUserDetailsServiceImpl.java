package com.online.shopping.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.online.shopping.model.UserData;

@Service
public class MyUserDetailsServiceImpl implements MyUserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserData register(UserData userData) {
		// TODO Auto-generated method stub
		return new UserData();
//		return null;
	}

	@Override
	public UserData login(UserData userDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
