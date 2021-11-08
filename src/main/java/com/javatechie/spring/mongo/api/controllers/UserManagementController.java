package com.javatechie.spring.mongo.api.controllers;


import com.javatechie.spring.mongo.api.model.User;
import com.javatechie.spring.mongo.api.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserManagementController {

	@Autowired
	private UserRespository repository;

	@PostMapping("/register")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "Added book with id : " + user.getId();
	}

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		return "user has been login successfully";
	}

	@GetMapping("/getAllUsers")
	public List<User> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/getUser/{id}")
	public Optional<User> getBook(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id : " + id;
	}


}