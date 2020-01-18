package com.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findByUserId(int userId);

    @SuppressWarnings("unchecked")
	User save(User user);
    
    int countByUserId();    
    
}
