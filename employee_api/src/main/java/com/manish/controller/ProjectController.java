package com.manish.controller;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.manish.dto.Employee;
import com.manish.dto.Project;
//import com.manish.service.ProjectService;
import com.manish.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService pservice;
	
	//GET Method
	
	@RequestMapping("/projects")
	public List <Project> getAllProject() {
		return pservice.getAllProject();
		
	}
	
//	@RequestMapping("/projects/{progName}")
//	public Project getProjectByName(@PathVariable String progName) {
//		return pservice.getElementByName(progName);
//	}
	
	
	@RequestMapping("/projects/{id}") 
	public Project getElementById(@PathVariable("id") ObjectId id) {
		return pservice.findBy_id(id);
		
	}
	
	
	//PUT Methods
	@RequestMapping(method=RequestMethod.PUT, value="/projects/{id}")
	public void updateProject(@RequestBody Project projects, @PathVariable("id") ObjectId id) {
		pservice.updateProject(projects, id);
	}
	
	//POST Methods
	@RequestMapping(method=RequestMethod.POST, value="/projects")
	public void addProject(@RequestBody Project projects) {
		pservice.addProject(projects);
	}
	
	//DELETE Methods
//	@RequestMapping(method=RequestMethod.DELETE, value="/projects/{id}")
//	public Project deleteProject(@PathVariable("id") ObjectId id) {
//		return pservice.deleteProject(id);
//	}
	

}
