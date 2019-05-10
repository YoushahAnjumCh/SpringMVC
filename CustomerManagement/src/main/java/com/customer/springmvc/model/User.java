package com.customer.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity(name="users")
public class User 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
private int userid;
@Size(min=2,max=50)
private String fname;
@Size(min=2,max=50)
private String lname;
@Email
private String email;
@Size(min=10,max=10)
private String mobile;
private String age;

public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
