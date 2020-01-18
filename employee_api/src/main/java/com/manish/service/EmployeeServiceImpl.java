package com.manish.service;

import java.util.List;

import com.manish.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.dao.EmployeeDao;
//import com.example.dao.IEmployeeDAO;


@Service
public class EmployeeServiceImpl implements IEmployee{
		
	@Autowired
	private EmployeeDao daoRef;

	@Override
	public List<Employee> getAllEmployee() {
		return daoRef.findAll(); // This is fetching from databases 
	}

//	@Override
//	public Employee getElementById(String empId) {
//		// TODO Auto-generated method stub
//		Employee employee=new Employee();
//		
//		 employee=	daoRef.findById(empId);
//		 return null;
//	}

//	@Override
//	public void addEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateEmployee(Employee employee, int empId) {
//		// TODO Auto-generated method stub
//		
//	}

	//@Override
	//public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	//}

//	@Override
//	public Employee getElementById(String empId) {
//		
//		
//		return null;
//	}

	@Override
	public Employee getElementByName(String empName) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee =daoRef.findByEmpName(empName);
		
		return employee;
	}

//	@Override
//	public Employee getElementById(int empId) {
//		// TODO Auto-generated method stub
//		// bellow we define lambda expression to getting empId (e ->e.getEmpId() == empId)
//		return emplist.stream().filter(e ->e.getEmpId() == empId).findFirst().get();
//		//return daoRef.findByempId(empId);
//		// This method is goes to DAO
//	}
//
//	@Override
//	public void addEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		emplist.add(employee);
//		//daoRef.save(employee);
//		
//	}
//
//	@Override
//	public void updateEmployee(Employee employee, String empId) {
//		// TODO Auto-generated method stub
//		for(int i=0; i<emplist.size(); i++) {
//			Employee e= emplist.get(i);
//			if(e.getEmpId()==empId) {
//				emplist.set(i, employee);
//				return;
//			}
//		}
//		
//		//daoRef.save(employee);
//		
//	}
//
//	@Override
//	public void deleteEmployee(String empId) {
//		// TODO Auto-generated method stub
//		emplist.remove(empId);
//		//emplist.removeIf(e->e.getEmpId()==empId);
//		//daoRef.deleteById(empId);
//	}

}
