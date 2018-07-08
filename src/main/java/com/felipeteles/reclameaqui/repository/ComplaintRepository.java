package com.felipeteles.reclameaqui.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipeteles.reclameaqui.domain.Complaint;

@Repository
public interface ComplaintRepository extends MongoRepository<Complaint, String>{

}
