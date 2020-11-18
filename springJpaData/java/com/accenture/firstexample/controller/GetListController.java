package com.accenture.firstexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.firstexample.bean.Student;
import com.accenture.firstexample.service.StudentService;

@RestController
public class GetListController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public List<Student> getDetails(){
		return studentService.getAllStudentsDetails();
	}
	@RequestMapping("/getById/{id}")
	public Student namedoesntmatter(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/value")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
	public void uodateStudent(@RequestBody Student student, @PathVariable Integer id) {
		studentService.updateStudent(id, student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void deleteStud(@PathVariable Integer id) {
		studentService.deleteStudent(id);
		}
}

