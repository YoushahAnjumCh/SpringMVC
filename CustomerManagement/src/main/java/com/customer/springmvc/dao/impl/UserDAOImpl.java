package com.customer.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.springmvc.dao.UserDAO;
import com.customer.springmvc.model.User;

@Repository("userDao")
public class UserDAOImpl implements UserDAO{

	@Autowired
	SessionFactory sessionFactory;

	public Session currentsession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void create(User usr) 
	{
		currentsession().save(usr);
	}

	public void update(User usr) 
	{
		currentsession().update(usr);
	}

	public User edit(Integer uid) {
		return find(uid);
	}
	
	 public void delete(Integer uid) { 
		 User usr = new User(); 
		 usr.setUserid(uid);
		 currentsession().delete(usr); 
		 }

	public User find(Integer uid) {
		return (User) currentsession().get(User.class, uid);
	}

	public List<User> getall() {
		return currentsession().createCriteria(User.class).list();
	}
}
