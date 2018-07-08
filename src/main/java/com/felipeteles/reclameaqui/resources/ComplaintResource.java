package com.felipeteles.reclameaqui.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipeteles.reclameaqui.domain.Complaint;
import com.felipeteles.reclameaqui.services.ComplaintService;

@RestController
@RequestMapping(value="/reclamacoes")
public class ComplaintResource {
	
	@Autowired
	private ComplaintService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Complaint>> findAll() {		
		List<Complaint> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
