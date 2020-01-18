package com.spring.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.spring.model.AddressVO;


@Document(collection= "employee")
public class EmployeeVO {
	
	@Id
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String designation;
	private double salary;
	private String location;
	
	private AddressVO address;
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public AddressVO getAddress() {
		return address;
	}
	public void setAddress(AddressVO address) {
		this.address = address;
	}
	
	
}
