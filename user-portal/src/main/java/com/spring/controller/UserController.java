package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping({"/api"})
@RequestMapping(value= "/users")
public class UserController {

    @Autowired
    private UserService userService;
 
    @PostMapping(value = "/addUser")
    public void create(@RequestBody User user){
        userService.create(user);
    }

    @GetMapping(path = {"/{userId}"})
    public User findOne(@PathVariable("userId") int userId){
        return userService.findByUserId(userId);
    }

    @PutMapping(path = {"/{userId}"})
    public void update(@PathVariable("userId") int userId, @RequestBody User user){
        user.setUserId(userId);
        userService.update(user);
    }
    
    @DeleteMapping(path ={"/{userId}"})
    public User delete(@PathVariable(value = "userId") int userId) {
        return userService.delete(userId);
    }

    @GetMapping(value= "/getUsers")
    public List<User> findAll(){
        return userService.findAll();
    }
        
}
