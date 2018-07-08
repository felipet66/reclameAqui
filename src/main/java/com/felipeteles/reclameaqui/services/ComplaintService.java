package com.felipeteles.reclameaqui.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeteles.reclameaqui.domain.Complaint;
import com.felipeteles.reclameaqui.repository.ComplaintRepository;

@Service
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository repo;
	
	public List<Complaint> findAll(){
		return repo.findAll();
	}
}
