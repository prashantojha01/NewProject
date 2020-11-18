package com.accenture.student.qualification;

public class Qualification {
	private String name;
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
	public Qualification(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
