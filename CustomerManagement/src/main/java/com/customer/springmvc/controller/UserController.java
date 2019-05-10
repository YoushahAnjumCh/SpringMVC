package com.customer.springmvc.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.customer.springmvc.model.User;
import com.customer.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController 
{

	@Autowired
	UserService usrservice;
	
@RequestMapping(value="/register",method=RequestMethod.GET)
public ModelAndView register(@ModelAttribute("usr") User usrs) {

	ModelAndView mv =new ModelAndView("user/register");
	return mv;	
}

@RequestMapping(value="/create",method=RequestMethod.POST)
public String create(@Valid @ModelAttribute("usr") User usrs ,BindingResult result) {
if(result.hasErrors()) 
{
	return "user/register";
}
	usrservice.create(usrs);
	return "redirect:/user/details/"+ usrs.getUserid();
		
}


@RequestMapping(value="/details/{userId}",method=RequestMethod.GET)
public String details(@PathVariable("userId") Integer userid,Map<String, Object> map) 
{
	User user=usrservice.find(userid);
	
	map.put("fname", user.getFname());
	map.put("lname", user.getLname());
	map.put("email", user.getEmail());
	map.put("mobile", user.getMobile());
	map.put("age", user.getAge());
	
	return "user/details";
}

@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Map<String,Object> mp)
	{
		mp.put("users",usrservice.getall());
		return "user/list";		
	}

@RequestMapping(value="/edit/{userid}",method=RequestMethod.GET)
public String edit(@PathVariable ("userid") Integer userid,Map<String, Object> map)
{
	
	map.put("usrs", usrservice.find(userid));
	return "user/edit";	
}

@RequestMapping(value="/update",method=RequestMethod.POST)
public String update(User usr) {
	usrservice.update(usr);
	return "redirect:/user/details/"+ usr.getUserid();
		
}
@RequestMapping(value="/delete/{userid}",method=RequestMethod.GET)
public String delete(@PathVariable ("userid") int userid)
{
	usrservice.delete(userid);
	return "redirect:/user/list";	
}
}
