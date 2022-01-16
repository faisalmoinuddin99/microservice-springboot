package com.rest.webservices.restfulwebservices.controller;

import com.rest.webservices.restfulwebservices.exception.UserNotFoundException;
import com.rest.webservices.restfulwebservices.model.User;
import com.rest.webservices.restfulwebservices.services.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import java.net.URI;
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

        User user =  userDAOService.findOne(id) ;
        if (user == null){
            throw  new UserNotFoundException("id " + id)  ;
        }
        return user ;
    }

    //CREATED
    // input --- details of user
    // output --- CREATED & Return the created URI
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody  User user){
       User savedUser = userDAOService.save(user) ;

       // CREATED
        // /user/{id}  savedUser.getId()
      URI location =ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri() ;

      return   ResponseEntity.created(location).build() ;

    }
}
