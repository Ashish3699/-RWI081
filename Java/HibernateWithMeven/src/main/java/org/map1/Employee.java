package org.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	private List<Project> project;

	public Employee(int eid, String name, List<Project> project) {
		super();
		this.eid = eid;
		this.name = name;
		this.project = project;
	}
	
	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", project=" + project + "]";
	}
	
	
}
