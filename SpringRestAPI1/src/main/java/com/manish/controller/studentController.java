package com.manish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.dto.Student;
import com.manish.service.studentService;



@RestController
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class studentController {
	
	@Autowired
	studentService studservice;

	@GetMapping("/students-list")
	public List<Student> getStudents() {
		 return studservice.getStudents();
	}
	
	
	
//	@PostMapping("/save-student")
//	public void saveStudent(@RequestBody student stud) {
//		 studentservice.saveStudent(stud);
//		
//	}
//	
//	
//	@DeleteMapping("/delete-student/{student_id}")
//	public void deleteStudent(@PathVariable("student_id") int student_id,student stud) {
//		stud.setStudent_id(student_id);
//		studentservice.deleteStudent(stud);
//	}
//
//	@GetMapping("/student/{student_id}")
//	public List<student> allstudentByID(@PathVariable("student_id") int student_id,student stud) {
//		 stud.setStudent_id(student_id);
//		 return studentservice.getStudentByID(stud);
//		
//	}
//	
//	@PostMapping("/update-student/{student_id}")
//	public void updateStudent(@RequestBody student stud,@PathVariable("student_id") int student_id) {
//		stud.setStudent_id(student_id);
//		studentservice.updateStudent(stud);
//	}
//	
	

}
