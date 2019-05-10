package com.customer.springmvc.dao;

import java.util.List;

import com.customer.springmvc.model.User;

public interface UserDAO 
{
public void create(User usr);

public void update(User usr);

public User edit(Integer uid);

public void delete(Integer uid);

public User find(Integer uid);

public List<User> getall();
}
