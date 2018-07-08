package com.felipeteles.reclameaqui.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipeteles.reclameaqui.domain.Complaint;
import com.felipeteles.reclameaqui.dto.ComplaintDTO;
import com.felipeteles.reclameaqui.services.ComplaintService;

@RestController
@RequestMapping(value="/api/complains")
public class ComplaintResource {
	
	@Autowired
	private ComplaintService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<ComplaintDTO>> findAll() {		
		List<Complaint> list = service.findAll();
		List<ComplaintDTO> listDto = list.stream().map(x -> new ComplaintDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<ComplaintDTO> findById(@PathVariable String id) {	
		Complaint complaintObj = service.findById(id);
		
		return ResponseEntity.ok().body(new ComplaintDTO(complaintObj));
	}
}
