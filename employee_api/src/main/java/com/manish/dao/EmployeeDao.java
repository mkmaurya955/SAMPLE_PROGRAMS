package com.manish.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manish.dto.Employee;

public interface EmployeeDao extends MongoRepository<Employee, Serializable> {

	

	List<Employee> findAll();
	//Employee findById(String empId);

	Employee findByEmpName(String empName);

		
		//Employee findBy_id(ObjectId _id);
		// This is method comes from services
		//List<Employee> getOne(int empId);

		//Employee findByempId(int empId);

}
