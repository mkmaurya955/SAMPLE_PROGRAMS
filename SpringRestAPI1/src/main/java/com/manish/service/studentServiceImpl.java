package com.manish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.dao.studentDao;
import com.manish.dto.Student;

@Service
public class studentServiceImpl implements studentService{
	
	@Autowired
	studentDao studentdao;

	@Override
	public List<Student> getStudents() {
		return studentdao.findAll();
	}
	
//	@Override
//	public void saveStudent(student stud) {
//		studentdao.save(stud);
//	}

	

//	@Override
//	public void deleteStudent(student stud) {
//		studentdao.delete(stud);
//	}
//
//	@Override
//	public List<student> getStudentByID(student stud) {
//		return studentdao.getStudentByID(stud);
//	}
//
//	@Override
//	public void updateStudent(student stud) {
//		studentdao.save(stud);
//	}
//	
//

}
