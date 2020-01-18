package com.manish.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.manish.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, String>{
	 List<User> findByEmail(String email);

	 //void deleteById(int id);

}
