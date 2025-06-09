package com.example.SpringBootGit.component;

import org.springframework.stereotype.Component;

import com.example.SpringBootGit.entity.UserRecord;
import com.example.SpringBootGit.repository.UserRepository;


	@Component
	public class DatabaseConduit {
	    private final UserRepository userRepository;

	    public DatabaseConduit(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public void save(UserRecord userRecord) {
	        userRepository.save(userRecord);
	    }

	}

