package com.springMockito.service;

public class UserServiceTest {
	
	
	public void testUserCreate() {
		
	 UserService us = new UserServiceImp();
	 
	 int id = 1;
	 String name = "kamal";
	 String address = "butwal";
	 
	 us.createUser(id, name, address);
	 
	}

}
