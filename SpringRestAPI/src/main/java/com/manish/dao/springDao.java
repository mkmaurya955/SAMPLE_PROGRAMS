package com.manish.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.manish.dto.springDto;

@Repository
public interface springDao extends MongoRepository<springDto, String> {
	//MongoRepository interface defines methods for all the CRUD operations
	//on the Document like finAll(), fineOne(), save(), delete() etc.
	

}
