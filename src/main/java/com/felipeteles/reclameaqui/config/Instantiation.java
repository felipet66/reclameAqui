package com.felipeteles.reclameaqui.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.felipeteles.reclameaqui.domain.Complaint;
import com.felipeteles.reclameaqui.domain.Locale;
import com.felipeteles.reclameaqui.repository.ComplaintRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private ComplaintRepository complaintRepository;
	
	@Override
	public void run(String... args) throws Exception {
		complaintRepository.deleteAll();
		
		Locale local = new Locale("Rua do Rócio", "Vila Olimpia", "São Paulo", "São Paulo", "Brasil");
		
		Complaint reclame1 = new Complaint(null, "Atraso de entrega", "Demorou 5 dias a mais para entregarem", local, "Post Stop");
		Complaint reclame2 = new Complaint(null, "Atraso de entrega", "Demorou 15 dias a mais para entregarem", local, "Pão Stop");
		
		complaintRepository.saveAll(Arrays.asList(reclame1, reclame2));
	}
	
}
