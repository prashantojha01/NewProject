package com.accenture.student.qualification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualificationService {
	//private List<Student> students =new ArrayList<>(Arrays.asList(new Student("ojha", 1), new Student("Baba", 2),
		//	new Student("Jindabad", 3)));
	@Autowired
	private QualificationDao qualificationDao;
	public List<QualificationEntity> getAllQualificationDetails(Integer Id) {
		List<QualificationEntity> qualifications= new ArrayList<QualificationEntity>();
		qualificationDao.findByStudentEntityId(Id).forEach(qualifications::add);
		return qualifications;
	}

	
	
	 public QualificationEntity getQualificationById(Integer id) { 
		 return qualificationDao.findById(id).orElse(null);
	 }
	 
	 

	
	 //public Student getStudentById(Integer id) { return students.stream().filter(t
	 //-> t.getId().equals(id)).findFirst().get(); }


	public void addQualification(QualificationEntity qualificationEntity) {
		// TODO Auto-generated method stub
		qualificationDao.save(qualificationEntity);
	}


	public void updateQualification(QualificationEntity qualificationEntity) {
		// TODO Auto-generated method stub
		
		qualificationDao.save(qualificationEntity);
	}



	public void deleteQualification(Integer id) {
		// TODO Auto-generated method stub
		qualificationDao.deleteById(id);
	}
	 
}
