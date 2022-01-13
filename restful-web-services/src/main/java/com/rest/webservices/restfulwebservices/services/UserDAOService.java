package com.rest.webservices.restfulwebservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.webservices.restfulwebservices.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserDAOService {
	
	private static final List<User> users = new ArrayList<>() ;
	
	private static int usersCount = 3 ;
	
	static {
		users.add(new User(1, "Naruto", new Date(5-11-2018))) ;
		users.add(new User(2, "Kakashi", new Date(8-1-2004))) ;
		users.add(new User(3, "Sasuke", new Date(5-3-2018))) ;
	}
	
	// 1. findAll()
	// 2. save() 
	// 3. findOne()
	
	public List<User> findAll() {
		return users ;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user) ;
		return user ;
	}
	public User findOne(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user ;
			}
		}
		return null ;
	}
}
