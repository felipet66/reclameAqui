package com.felipeteles.reclameaqui.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipeteles.reclameaqui.domain.Complaint;

@Repository
public interface ComplaintRepository extends MongoRepository<Complaint, String>{
	List<Complaint> findByTitleContainingIgnoreCase(String text);
	
	List<Complaint> findByDescriptionContainingIgnoreCase(String text);
	
	List<Complaint> findByCompanyContainingIgnoreCase(String text);
}
