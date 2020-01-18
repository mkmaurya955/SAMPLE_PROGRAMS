package com.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.EmployeeVO;

public interface EmployeeRepository extends CrudRepository<EmployeeVO, Integer> {
	@SuppressWarnings("unchecked")
	EmployeeVO save(EmployeeVO employee);
	 List<EmployeeVO> findAll();
}
