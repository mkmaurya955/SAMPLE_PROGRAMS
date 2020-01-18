package com.manish.dao;


//import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manish.dto.Project;

@Repository
//public interface ProjectDao extends MongoRepository<Project , Serializable>{
//public interface ProjectDao extends MongoRepository<Project , String>,ProjectDaoRepository<Project , String>{
public interface ProjectDao extends CrudRepository<Project , String>{	
	List<Project> findAll();
	Project findBy_id(ObjectId _id);
	//Project findByProgName(String progName);
	//id deleteById(ObjectId id);
	//Project delete(ObjectId id);
	//void delete(ObjectId id);
	
}
