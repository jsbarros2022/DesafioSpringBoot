package me.dio.domain.service;

import me.dio.domain.model.User;


public interface UserService {
	
	User findById(Long id); 
		
		void User_create (User userToCreate);

		User create(User userToCreate);
		
		
	

}
