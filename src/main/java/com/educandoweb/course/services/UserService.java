package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.USerRepository;

@Service
public class UserService {
	
	@Autowired
	private USerRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	@GetMapping
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}	
}
