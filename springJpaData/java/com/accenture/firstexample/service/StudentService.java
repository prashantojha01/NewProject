package com.accenture.firstexample.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.firstexample.bean.Student;

@Service
public class StudentService {
	private List<Student> students =new ArrayList<>(Arrays.asList(new Student("ojha", 1), new Student("Baba", 2),
			new Student("Jindabad", 3)));

	public List<Student> getAllStudentsDetails() {
		return students;
	}

	
	
	 public Student getStudentById(Integer id) { 
		 for(int i=0;i<students.size();i++) {
			 Student student=students.get(i);
			 if(student.getId().equals(id)) {
				 return student;
			 }
		 }
			 return null;
	 }
	 
	 

	
	 //public Student getStudentById(Integer id) { return students.stream().filter(t
	 //-> t.getId().equals(id)).findFirst().get(); }


	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
	}


	public void updateStudent(Integer id,Student student) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<students.size();i++)
		{
			Student student1=students.get(i);
			if(student1.getId().equals(id)) {
				students.set(i,student);
				return;
			}
		}
	}



	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		students.removeIf(t -> t.getId().equals(id));
	}
	 
}
