package com.korolar.itennis;

import com.korolar.itennis.entity.User;
import com.korolar.itennis.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserResource {

	@Autowired private UserRepository userRepository;

	@GetMapping("/users") public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@PostMapping("/users") void addUser(@RequestBody User user) {
		//todo: add user validation
		userRepository.save(user);
	}
}
