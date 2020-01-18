package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeRepository;
import com.spring.model.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	   @Autowired
	   private EmployeeRepository repository;
	   
	   @Override
	   public EmployeeVO create(EmployeeVO employee) {    		    	
	       return repository.save(employee);
	   }
	   
	   @Override
	   public List<EmployeeVO> findAll(){
		   return repository.findAll();
	   }
	    
}
