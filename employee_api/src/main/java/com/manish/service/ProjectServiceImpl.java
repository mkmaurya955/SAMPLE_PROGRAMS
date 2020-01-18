package com.manish.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.manish.dao.ProjectDao;
import com.manish.dto.Project;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectDao pdaoref;
	
	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return pdaoref.findAll();
	}

//	@Override
//	public Project getElementByName(String progName) {
//		// TODO Auto-generated method stub
//		Project prog=new Project(null, progName, progName, progName);
//		prog=pdaoref.findByProgName(progName);
//		return prog;
//	}

	@Override
	public Project findBy_id(ObjectId id) {
		// TODO Auto-generated method stub
		return pdaoref.findBy_id(id);
	}

	@Override
	public void updateProject(Project projects, ObjectId id) {
		// TODO Auto-generated method stub
		pdaoref.save(projects);
		
	}

	@Override
	public void addProject(Project projects) {
		// TODO Auto-generated method stub
		pdaoref.save(projects);
		
	}

//	@Override
//	public Project deleteProject(ObjectId id) {
//		pdaoref.delete(id);
//		return null;
//	}

//	@Override
//	public void deleteProject(ObjectId id) {
//		pdaoref.deleteById(id);
//		
//	}


}
