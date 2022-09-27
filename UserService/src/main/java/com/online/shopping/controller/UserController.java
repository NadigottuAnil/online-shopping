package com.online.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.shopping.model.UserData;
import com.online.shopping.service.MyUserDetailsService;

@RestController
@RequestMapping("api/v1.0/shopping")
public class UserController {

	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@PostMapping("/register")
	public ResponseEntity<UserData> register(@RequestBody UserData userDetails) {
		return ResponseEntity.ok(myUserDetailsService.register(userDetails));
	}
}
