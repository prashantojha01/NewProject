package com.accenture.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	//private List<Student> students =new ArrayList<>(Arrays.asList(new Student("ojha", 1), new Student("Baba", 2),
		//	new Student("Jindabad", 3)));
	@Autowired
	private StudentDao studentDao;
	public List<StudentEntity> getAllStudentsDetails() {
		List<StudentEntity> students= new ArrayList<StudentEntity>();
		studentDao.findAll().forEach(students::add);
		return students;
	}

	
	
	 public StudentEntity getStudentById(Integer id) { 
		 return studentDao.findById(id).orElse(null);
	 }
	 
	 

	
	 //public Student getStudentById(Integer id) { return students.stream().filter(t
	 //-> t.getId().equals(id)).findFirst().get(); }


	public void addStudent(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		studentDao.save(studentEntity);
	}


	public void updateStudent(Integer id,StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		
		studentDao.save(studentEntity);
	}



	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentDao.deleteById(id);
	}
	 
}
