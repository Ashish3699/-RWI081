package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Teacher {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String city;
	

	public Teacher(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Teacher() {
		super();
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	

}
