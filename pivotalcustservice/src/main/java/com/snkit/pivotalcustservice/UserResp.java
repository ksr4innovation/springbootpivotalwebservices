package com.snkit.pivotalcustservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserResp implements Serializable{
	
	private List<User> userList ;
	
	public UserResp() {
		userList = new ArrayList<User>();
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
