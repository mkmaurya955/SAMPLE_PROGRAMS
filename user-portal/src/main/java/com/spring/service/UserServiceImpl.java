package com.spring.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserRepository;
import com.spring.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {    	
    	List<User> users = repository.findAll();
    	Integer maxUserId = users
    		      .stream()
    		      .mapToInt(u -> u.getUserId())
    		      .max().orElseThrow(NoSuchElementException::new);
    	user.setUserId(maxUserId+1);
        return repository.save(user);
    }

    @Override
    public User delete(int userId) {
        User user = findByUserId(userId);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findByUserId(int userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }
}
