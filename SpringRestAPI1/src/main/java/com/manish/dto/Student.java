package com.manish.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	@Id
	public ObjectId _id;
	
	private String student_id;
	private String student_name;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	private String student_email;
	private String student_branch;
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_branch() {
		return student_branch;
	}
	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}
	public Student(ObjectId _id, String student_id, String student_name, String student_email, String student_branch) {
		super();
		this._id = _id;
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_branch = student_branch;
	}
	@Override
	public String toString() {
		return "Student [_id=" + _id + ", student_id=" + student_id + ", student_name=" + student_name
				+ ", student_email=" + student_email + ", student_branch=" + student_branch + "]";
	}
	
	
	

}
