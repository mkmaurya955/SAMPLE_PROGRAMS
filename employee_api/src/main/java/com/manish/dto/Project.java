package com.manish.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="projects")
public class Project {
	@Id
	public ObjectId _id;
	private int progid;
	private String progName;
	private String progType;
	private String progDept;
	
	
	
	
	public Project(ObjectId _id, int progid, String progName, String progType, String progDept) {
		super();
		this._id = _id;
		this.progid = progid;
		this.progName = progName;
		this.progType = progType;
		this.progDept = progDept;
	}
	
	
	
	
	// ObjectId needs to be converted to string
	//The @Id annotation tells spring that the
	//_id field will be used as the primary identifier
	 public String get_id() { 
		 return _id.toHexString(); 
		 }
	 public void set_id(ObjectId _id) {
		 this._id = _id; 
		 }
	
	 
	 
	public int getProgid() {
		return progid;
	}


	public void setProgid(int progid) {
		this.progid = progid;
	}




	public String getProgName() {
		return progName;
	}
	public void setProgName(String progName) {
		this.progName = progName;
	}
	public String getProgType() {
		return progType;
	}
	public void setProgType(String progType) {
		this.progType = progType;
	}
	public String getProgDept() {
		return progDept;
	}
	public void setProgDept(String progDept) {
		this.progDept = progDept;
	}
	
	
}
