package com.rest.webservices.restfulwebservices.controller;

import com.rest.webservices.restfulwebservices.model.User;
import com.rest.webservices.restfulwebservices.services.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List ;

@RestController
public class UserController {

    @Autowired
    UserDAOService userDAOService ;

    @GetMapping(path = "/users")
    public List<User> findAllUsers(){
        return userDAOService.findAll() ;
    }

    @GetMapping(path = "/users/{id}")
    public User findByUserId(@PathVariable int id){
        return userDAOService.findOne(id) ;
    }
}
