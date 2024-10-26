package com.springMockito.service;

import com.springMockito.entity.User;

public interface UserService {

	public User createUser(int id, String name, String address);
}
