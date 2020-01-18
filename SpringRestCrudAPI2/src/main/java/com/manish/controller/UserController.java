package com.manish.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.dao.UserRepository;
import com.manish.model.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
    private UserRepository repository;
	
	//POST Method
    @PostMapping("/User/create")
//    public String register(@RequestBody User user) {
//        repository.save(user);
//        return "Hi " + user.getName() + " your Registration process successfully completed";
//    }
    	public User register(@RequestBody User user) {
    		User _user=repository.save(new User(user.getId(), user.getName(), user.getEmail(), user.getExperience(), user.getDomain()));
    		return _user;
    }
    
    //Get Method
    @GetMapping("/User/getAllUsers")
    public List<User> findAllUsers() {
        //return repository.findAll();
    	System.out.println("Get all Users.......");
    	List<User> user =new ArrayList<>();
        repository.findAll().forEach(user::add);
        return user;
    }

    //GET Mathod
    @GetMapping("User/findUser/{email}")
    public List<User> findUser(@PathVariable String email) {
    	List<User> user =repository.findByEmail(email);
        return user;
    }
    
    //DELETE Mathod
    @DeleteMapping("/User/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") String id){
    	System.out.println("Delete User with ID = " + id + "...");
    	repository.deleteById(id);
    	return new ResponseEntity<>("Use has been deleted!", HttpStatus.OK);
    }
//    public List<User> cancelRegistration(@PathVariable int id) {
//        repository.deleteById(id);
//        return repository.findAll();
//    }
    
    //PUT Method
//    @PutMapping("User/update/{id}")
//    public ResponseEntity<User> updateUser(@PathVariable("id") String id, @RequestBody User user) {
//        System.out.println("Update Customer with ID = " + id + "...");
//     
//        Optional<User> userData = repository.findById(id);
//     
//        if (userData.isPresent()) {
//          User _user = userData.get();
//          _user.setName(user.getName());
//          _user.setEmail(user.getEmail());
//          _user.setExperience(user.getExperience());
//          _user.setDomain(user.getDomain());
//          return new ResponseEntity<>(repository.save(_user), HttpStatus.OK);
//        	} else {
//          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        	}
//    	}


}
