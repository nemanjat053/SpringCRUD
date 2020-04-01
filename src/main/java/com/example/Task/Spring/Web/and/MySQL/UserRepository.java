package com.example.Task.Spring.Web.and.MySQL;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	// This willl be AUTO IMPLEMENTED by Spring into a Bean called userRepository
	// CRUD refers Create, Read, Update, Delete

}
