package com.cg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.cg.app.dao.UserDaoInterface;
import com.cg.app.entity.User;

@Service("userService")
public class UserService implements UserServiceInterface {
 
	@Autowired
	private UserDaoInterface userDaoInterface;
	@Override
	public User signUp(User user) {
		 userDaoInterface.signUp(user);
		 return user;
	}
	@Override
	public List<User> login() {
		return userDaoInterface.login();
	}
	@Override
	public Boolean delete(int id) {
		return userDaoInterface.delete(id);
	}
	@Override
	public User findByid(int id) {
		return userDaoInterface.findByid(id);
	}
	@Override
	public boolean existsByid(int id) {
		return userDaoInterface.findid(id);
	}
	@Override
	public void updateData(User user) {
		userDaoInterface.update(user);
		
	}
}