package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String city;
	private Certificate cf;

	public Student(int id, String name, String city, Certificate cf) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.cf = cf;
	}

	public Student() {
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

	public Certificate getCf() {
		return cf;
	}

	public void setCf(Certificate cf) {
		this.cf = cf;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", cf=" + cf + "]";
	}

}