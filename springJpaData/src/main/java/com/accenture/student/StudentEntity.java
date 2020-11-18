package com.accenture.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	private String name;
	@Id
	private Integer id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	public StudentEntity(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
