package com.felipeteles.reclameaqui.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.felipeteles.reclameaqui.domain.Complaint;
import com.felipeteles.reclameaqui.domain.Locale;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	@NotNull(message = "Field \"title\" can not be emptys.")
	private String title;
	
	@NotNull(message = "Field \"description\" can not be emptys.")
	private String description;
	
	@NotNull(message = "Field \"locale\" can not be emptys.")
	private Locale locale;
	
	@NotNull(message = "Field \"company\" can not be emptys.")
	private String company;
	
	public ComplaintDTO(Complaint complaintObj) {
		id 			= complaintObj.getId();
		title 		= complaintObj.getTitle();
		description = complaintObj.getDescription();
		locale		= complaintObj.getLocale();
		company 	= complaintObj.getCompany();
	}
}
