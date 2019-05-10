package com.customer.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.customer.springmvc.dao.UserDAO;
import com.customer.springmvc.model.User;
import com.customer.springmvc.service.UserService;

@Service("usrservice")
@Transactional(propagation=Propagation.SUPPORTS, rollbackFor=Exception.class)
public class UserServiceImpl  implements UserService
{
	@Autowired
	UserDAO userDao;   //this is user dao impl repo name its should be same
	public void create(User usr) {
		userDao.create(usr);
	}

	public void update(User usr) {
		userDao.update(usr);
	}

	public User edit(Integer uid) {
		return userDao.edit(uid);
	}

	public void delete(Integer uid) {
		userDao.delete(uid);
	}

	public User find(Integer uid) {
		return userDao.find(uid);
	}

	public List<User> getall() {
		return userDao.getall();
	}

}
