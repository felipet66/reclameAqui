package com.felipeteles.reclameaqui.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipeteles.reclameaqui.domain.Complaint;

@RestController
@RequestMapping(value="/reclamacoes")
public class ComplaintResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Complaint> listar() {
		Complaint re1 = new Complaint(1,"Venda ilegal", "Venda ilegal", "SP", "Reclame Aqui");
		
		List<Complaint> list = new ArrayList<>();
		list.add(re1);
		
		return list;
	}
}
