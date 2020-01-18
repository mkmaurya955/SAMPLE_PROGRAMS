package com.manish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manish.dto.Employee;
import com.manish.service.IEmployee;

@RestController
public class EmployeeController {
	
	@Autowired // we have to autowired each service in controller
	IEmployee empservice; //this is object of service method
	
	@RequestMapping("/welcome")
	public String welcomeEmployee() {
		return "Hello Employee";
	}
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empservice.getAllEmployee();
	}// this is service method which is called by service object
//				Arrays.asList(
//				new Employee(1, "Manish", "Application"),
//				new Employee(2, "Kumar", "Support"),
//				new Employee(3, "Maurya", "Engineer")));		

	
	@RequestMapping("/employees/{empName}")
	//@RequestMapping("/employees/{employeeId}") 
	//public Employee getElementById(@PathVariable("employeeId") int empId) {
	// path variable providing the path of the url(employeeId) in service empId
	public Employee getElementById(@PathVariable String empName) {
		return empservice.getElementByName(empName);
	}
	
	// requestBody is used for if get and post method have same url 
	// to identify that or differentiate between get and post method
	// we used post method like bellow
//	@RequestMapping(method=RequestMethod.POST, value="/employees")
//	public void addEmployee(@RequestBody Employee employee) {
//		empservice.addEmployee(employee);
//	}
//	
//	@RequestMapping(method=RequestMethod.PUT, value="/employees/{empId}")
//	public void updateEmployee(@RequestBody Employee employee, @PathVariable int empId) {
//		empservice.updateEmployee(employee, empId);
//	}
//	
//	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{empId}")
//	public void deleteEmployee(@PathVariable int empId) {
//		empservice.deleteEmployee(empId);
//	}
	
//	@ExceptionHandler
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public void handleTodoNotFound(EmployeeNotFoundException ex) {
//    }
	
	

}
