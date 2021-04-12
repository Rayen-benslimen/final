package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pfe.GestionBank.entity.User;
import com.pfe.GestionBank.repository.UserRepository;
import com.pfe.GestionBank.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User save( User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public User findById(int id) {
		Optional<User> user;
		user = userRepository.findById(id);
		if (user.isPresent()) {
			return user.get();
		}
		throw new NullPointerException("user not found");
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();

	}

}
