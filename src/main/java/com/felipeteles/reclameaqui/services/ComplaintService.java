package com.felipeteles.reclameaqui.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeteles.reclameaqui.domain.Complaint;
import com.felipeteles.reclameaqui.repository.ComplaintRepository;
import com.felipeteles.reclameaqui.services.exception.ObjectNotFoundException;

@Service
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository repo;
	
	public List<Complaint> findAll(){
		return repo.findAll();
	}
	
	public Complaint findById(String id) {
		Optional<Complaint> complaintObj = repo.findById(id);
		return complaintObj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
