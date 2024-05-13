package org.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;
	@Column(name = "Project_Name")
	private String projectName;
	
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee;

	public Project(int pid, String projectName, List<Employee> employee) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.employee = employee;
	}
	
	public Project() {
		super();
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", employee=" + employee + "]";
	}	
	
	
	
}
