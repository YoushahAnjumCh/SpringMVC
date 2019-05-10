package com.customer.springmvc.service;

import java.util.List;

import com.customer.springmvc.model.User;

public interface UserService 
{
	public void create(User usr);

	public void update(User usr);

	public User edit(Integer uid);

	public void delete(Integer uid);

	public User find(Integer uid);

	public List<User> getall();
}
