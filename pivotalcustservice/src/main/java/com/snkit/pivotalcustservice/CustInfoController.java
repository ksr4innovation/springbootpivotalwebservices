package com.snkit.pivotalcustservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustInfoController {

	private int count=0;
	
	@GetMapping(value="/getUsers")
	public UserResp getUsers() {
		
		UserResp resp = new UserResp();
		
		User u = new User();
		u.setId(count++);
		u.setName("KSR");
		u.setDesg("STA");
		
		User u1 = new User();
		u1.setId(count++);
		u1.setName("Kollu");
		u1.setDesg("Software Engineer");
		
		resp.getUserList().add(u);
		resp.getUserList().add(u1);
		
		return resp;
	}
}
