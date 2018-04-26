package com.snkit.pivotalconsumerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustInfoController {

	
	@Autowired
	private UserService userService;
	
	
	
	@GetMapping(value="/getUsers")
	public String getUsers() {
		
		return userService.getUser();
		
	}
}
