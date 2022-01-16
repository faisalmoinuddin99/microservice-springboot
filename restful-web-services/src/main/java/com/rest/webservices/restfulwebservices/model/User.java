package com.rest.webservices.restfulwebservices.model;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {
	
	private Integer id ;
	@Size(min = 2, message = "Name should have at least 2 character")
	private String name ;
	@Past
	private Date dateOfBirth ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public User(Integer id, String name, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	public User() {}

}
