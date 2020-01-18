package com.manish.service;

import java.util.List;

import com.manish.dto.Employee;

public interface IEmployee {

	List<Employee> getAllEmployee();
	// This is declaration of method
		//this method is called by service object in controller and also 
		// implemented in EmployeeServiceimpl 

	Employee getElementByName(String empName);

//	void addEmployee(Employee employee);
//
//	void updateEmployee(Employee employee, int empId);
//
//	void deleteEmployee(int empId);

}
