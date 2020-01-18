package com.manish.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registration")
public class User {
	@Id
    private String id;
    
	private String name;
    private String email;
    private int experience;
    private String domain;
    
    public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public User(String id, String name, String email, int experience, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.domain = domain;
	}
	public String getId() {
		return id;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", experience=" + experience + ", domain="
				+ domain + "]";
	}
    
    

}
