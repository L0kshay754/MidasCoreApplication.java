package com.example.SpringBootGit.repository;


	import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootGit.entity.UserRecord;

	public interface UserRepository extends CrudRepository<UserRecord, Long> {
	    UserRecord findById(long id);
	}
