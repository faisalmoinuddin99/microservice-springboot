package com.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	
	private static List<UserBean> users = new ArrayList<>() ;
	
	static {
		users.add(new UserBean(1, "Naruto", new Date(5-11-2018))) ;
		users.add(new UserBean(2, "Kakashi", new Date(8-1-2004))) ;
		users.add(new UserBean(3, "Sasuke", new Date(5-3-2018))) ;
	}
	
	// 1. findAll()
	// 2. save() 
	// 3. findOne()
	
	public List<String> findAll() {
		return users.stream().map(e -> e.getName()).collect(Collectors.toList()) ;
	}
	
	public UserBean findOne(int id) {
		return (UserBean) users.stream().filter(e -> e.getId() == id).collect(Collectors.toList()) ;
	}
}
