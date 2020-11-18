package com.accenture.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student")
	public List<StudentEntity> getDetails(){
		return studentService.getAllStudentsDetails();
	}
	@RequestMapping("/studentById/{id}")
	public StudentEntity namedoesntmatter(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void addStudent(@RequestBody StudentEntity studentEntity) {
		studentService.addStudent(studentEntity);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
	public void uodateStudent(@RequestBody StudentEntity studentEntity, @PathVariable Integer id) {
		studentService.updateStudent(id, studentEntity);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
	public void deleteStud(@PathVariable Integer id) {
		studentService.deleteStudent(id);
		}
}

