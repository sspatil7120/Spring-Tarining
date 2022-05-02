package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
	//retrive All users
	@GetMapping("/users/")
	public List<User> retriveAllUsers(){
		return  service.findAll();
	}
	
	//retrive Users (int id)
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	
	//CREATED
	//input details of the user
	//output -CRAETED And Return the Created URI
	
	@PostMapping("/users")
	public void createUSer(@RequestBody User user ) {
		User savedUser =service.save(user);
		
	}
}
