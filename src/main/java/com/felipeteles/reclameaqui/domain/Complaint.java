package com.felipeteles.reclameaqui.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document
@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Complaint implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@NotNull(message = "Field \"title\" can not be emptys.")
	private String title;
	
	@NotNull(message = "Field \"description\" can not be emptys.")
	private String description;
	
	private Locale locale;
	
	@NotNull(message = "Field \"company\" can not be emptys.")
	private String company;
}
