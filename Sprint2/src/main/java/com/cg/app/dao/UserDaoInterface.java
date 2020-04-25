package com.cg.app.dao;

import java.util.List;

import com.cg.app.entity.User;

public interface UserDaoInterface {
	
	public User signUp(User user);
	
	List<User> login();

	Boolean delete(int id);

	 boolean findid(int id);

	User findByid(int id);

	void update(User user);

}
