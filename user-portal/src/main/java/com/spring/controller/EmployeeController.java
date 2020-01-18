package com.spring.controller;

//import java.util.Comparator;
import java.util.List;
//import java.util.Map;
//import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.EmployeeVO;
import com.spring.service.EmployeeService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value= "/employee")
public class EmployeeController {
	 @Autowired
	 private EmployeeService employeeService;
	 
	 @PostMapping
	 public EmployeeVO create(@RequestBody EmployeeVO employee){
	      return employeeService.create(employee);
	 }

	 @GetMapping(value= "/getEmployees")
	    public List<EmployeeVO> findAll(){
		 List<EmployeeVO> emplist= null;
		 emplist = employeeService.findAll();
				 
		 List<String> empids = emplist.stream().map(e->e.getEmployeeId()).collect(Collectors.toList());
		 empids.stream().forEach(System.out::println);	 
		 
		 List<Double> listsalary = emplist.stream().map(e->e.getSalary()).collect(Collectors.toList());
		 listsalary.stream().forEach(System.out::println);
		 
		 Double maxsal = listsalary.stream().max(Double::compare).get(); 
		 System.out.println("max salary----"+maxsal);
		
		 
		 
		 
		 
		 
		 return emplist;
	    }
	 
}
