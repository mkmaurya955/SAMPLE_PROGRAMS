package com.spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "user")
public class User {
	@Id ObjectId _id;
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
      
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(ObjectId _id, int userId, String firstName, String lastName, String email) {
		super();
		this._id = _id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public User() {
		super();
		
	}
	
	
	
    
}
