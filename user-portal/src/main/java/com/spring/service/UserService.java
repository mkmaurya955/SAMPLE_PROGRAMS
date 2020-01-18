package com.spring.service;

import java.util.List;

import com.spring.model.User;

public interface UserService {

    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findByUserId(int id);

    User update(User user);
}
