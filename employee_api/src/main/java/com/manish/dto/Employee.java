package com.manish.dto;

//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "employees")
public class Employee {
	//@Id
	//private int empId;
	private String empName;
	private String deptName;
	
	
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
