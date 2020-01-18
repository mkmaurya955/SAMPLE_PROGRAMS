package com.spring.service;

import java.util.List;

import com.spring.model.EmployeeVO;

public interface EmployeeService {	
	EmployeeVO create(EmployeeVO employeeVO);
	List<EmployeeVO> findAll();
}
