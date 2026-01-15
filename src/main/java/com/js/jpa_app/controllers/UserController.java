package com.js.jpa_app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.js.jpa_app.repository.User;

@RestController
@RequestMapping("/users")
public class UserController {

	/*
	 * private final UserRepository userRepository;
	 * 
	 * public UserController(UserRepository userRepository) { this.userRepository =
	 * userRepository; }
	 * 
	 * @PostMapping public User createUser(@RequestBody UserDTO user) { User u = new
	 * User(); u.setName( user.getName() ); u.setEmail( user.getEmail() ); return
	 * userRepository.save(u); }
	 */

	@GetMapping
	public List<User> getAllUsers() {
		// return userRepository.findAll();
		User u = new User();
		u.setName("john");
		u.setEmail("john@gmail.com");
		List<User> l = new ArrayList();
		l.add(u);
		return l;
	}
}
