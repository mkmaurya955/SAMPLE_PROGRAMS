package com.manish.dao;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manish.dto.Student;


@Repository
public interface studentDao extends CrudRepository<Student, String>{

	List<Student> findAll();

}
