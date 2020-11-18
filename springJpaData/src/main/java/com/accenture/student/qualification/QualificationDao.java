package com.accenture.student.qualification;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationDao extends CrudRepository<QualificationEntity, Integer>{
	public List<QualificationEntity> findByStudentEntityId(Integer qualificatioId);
}
