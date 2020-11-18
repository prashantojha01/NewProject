package com.accenture.student.qualification;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.accenture.student.StudentEntity;

@Entity
public class QualificationEntity {
	private String name;
	@Id
	private Integer id;
	@ManyToOne
	private StudentEntity studentEntity;
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
		return "QualificationEntity [name=" + name + ", id=" + id + "]";
	}
	public QualificationEntity(String name, Integer id, Integer studentId) {
		super();
		this.name = name;
		this.id = id;
		this.studentEntity=new StudentEntity("",studentId);
	}
	public StudentEntity getStudentEntity() {
		return studentEntity;
	}
	public void setStudentEntity(StudentEntity optional) {
		this.studentEntity = optional;
	}
	public QualificationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
