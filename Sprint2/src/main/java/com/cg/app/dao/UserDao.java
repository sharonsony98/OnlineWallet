package com.cg.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.app.entity.User;

@Transactional
@Repository("userDao")
public class UserDao implements UserDaoInterface {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public User signUp(User user) {
		entityManager.persist(user);
		return user;
	}
	@Override
	public List<User> login() {
		TypedQuery<User> query=entityManager.createQuery("SELECT user FROM User AS user", User.class);
		return query.getResultList();
	}
	@Override
	public Boolean delete(int id) {
		User user = entityManager.find(User.class, id);
		if(user!=null){
			entityManager.remove(user);
			return true;
		}
	return false;
	}
	@Override
	public User findByid(int id) {
		return entityManager.find(User.class, id);
	}
	@Override
	public boolean findid(int id){
		if(entityManager.contains(entityManager.find(User.class, id))){
			return true;
		}
		return false;
	}
	@Override
	public void update(User user) {
		  User userUpdate= entityManager.find(User.class, user.getId());
		  userUpdate.getEmail();
		  userUpdate.getFirstname();
		  userUpdate.getLastname();
		  userUpdate.getPassword();
		  userUpdate.getPhoneNumber();
		  userUpdate.getActive();
		  entityManager.persist(userUpdate);
		  System.out.println("update ");
		
	}
}