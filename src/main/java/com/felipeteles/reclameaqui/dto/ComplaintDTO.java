package com.felipeteles.reclameaqui.dto;

import java.io.Serializable;

import com.felipeteles.reclameaqui.domain.Complaint;

public class ComplaintDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String title;
	private String description;
	private String locale;
	private String company;
	
	public ComplaintDTO() {
		
	}
	
	public ComplaintDTO(Complaint complaintObj) {
		id 			= complaintObj.getId();
		title 		= complaintObj.getTitle();
		description = complaintObj.getDescription();
		locale		= complaintObj.getLocale();
		company 	= complaintObj.getCompany();
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
