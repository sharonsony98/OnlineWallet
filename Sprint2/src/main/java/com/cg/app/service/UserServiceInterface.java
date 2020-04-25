package com.cg.app.service;

import java.util.List;

import com.cg.app.entity.User;

public interface UserServiceInterface {

	User signUp(User user);

	public List<User> login();

	Boolean delete(int id);

	User findByid(int id);

	boolean existsByid(int id);

	void updateData(User user);


}
