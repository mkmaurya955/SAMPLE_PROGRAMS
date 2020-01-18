package com.manish.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.manish.dto.Project;

public interface ProjectService {

	List<Project> getAllProject();

	//Project getElementByName(String progName);

	Project findBy_id(ObjectId id);

	void updateProject(Project projects, ObjectId id);

	void addProject(Project projects);

//	Project deleteProject(ObjectId id);

	//void deleteProject(ObjectId id);

	
}
