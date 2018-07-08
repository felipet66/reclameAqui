package com.felipeteles.reclameaqui.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody ComplaintDTO complaintDtoObj) {	
		Complaint complaintObj = service.fromDTO(complaintDtoObj);
		complaintObj = service.insert(complaintObj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(complaintObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable String id) {	
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody ComplaintDTO complaintDtoObj, @PathVariable String id) {	
		Complaint complaintObj = service.fromDTO(complaintDtoObj);
		complaintObj.setId(id);
		complaintObj = service.update(complaintObj);
		return ResponseEntity.noContent().build();
	}
}
