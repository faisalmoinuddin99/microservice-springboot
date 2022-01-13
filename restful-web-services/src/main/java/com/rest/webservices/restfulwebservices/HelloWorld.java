package com.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@Autowired
	public UserDAOService userDAOService ;
	@GetMapping(path = "/hello-world")
	public String helloworld() {
		return "Hello world" ;
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello") ;
	}
	
	@GetMapping(path = "/hello/{name}")
	public HelloWorldBean helloWithGreeting(@PathVariable String name) {
		return new HelloWorldBean(String.format("Good Evening, %s", name)) ;
	}

}
