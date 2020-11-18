package com.accenture.student.qualification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.student.StudentEntity;
import com.accenture.student.StudentService;

@RestController
public class QualificationController {
	@Autowired
	private QualificationService qualificationService;
	
	@RequestMapping("/studentById/{studentId}/qualification")
	public List<QualificationEntity> getDetails(@PathVariable Integer studentId){
		return qualificationService.getAllQualificationDetails(studentId);
	}
	
	@RequestMapping("/studentById/{studentId}/qualificationById/{qualificationId}")
	public QualificationEntity namedoesntmatter(@PathVariable Integer qualificationId) {
		return qualificationService.getQualificationById(qualificationId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/studentById/{studentId}/qualification")
	public void addStudent(@RequestBody QualificationEntity qualificationEntity,@PathVariable Integer studentId) {
		qualificationEntity.setStudentEntity(new StudentEntity("",studentId));
				//new StudentService().getStudentById(studentId));
		qualificationService.addQualification(qualificationEntity);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/studentById/{studentId}/qualification/{qualificationId}")
	public void uodateStudent(@RequestBody QualificationEntity qualificationEntity,@PathVariable Integer studentId,@PathVariable Integer qualificationId) {
		qualificationEntity.setStudentEntity(new StudentEntity("",studentId));  
				//new StudentService().getStudentById(studentId));
		qualificationService.updateQualification(qualificationEntity);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteStudent/{studentId}/qualification/{qualificationId}")
	public void deleteQualification( @PathVariable Integer qualificationId) {
		//QualificationEntity qualificationEntity=new QualificationEntity();
		//qualificationEntity.setStudentEntity(new StudentEntity("",studentId));
		
		qualificationService.deleteQualification(qualificationId);
		}
}
