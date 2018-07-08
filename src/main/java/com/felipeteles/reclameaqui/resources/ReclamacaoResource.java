package com.felipeteles.reclameaqui.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/reclamacoes")
public class ReclamacaoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest this running";
	}
}
