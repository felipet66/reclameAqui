package com.felipeteles.reclameaqui.domain;

import javax.validation.constraints.NotNull;

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
public class Locale {
	 @NotNull(message = "Field \"street\" can not be emptys.")
	 private String street;
	
	 @NotNull(message = "Field \"neighborhood\" can not be emptys.")
	 private String neighborhood;
	
	 @NotNull(message = "Field \"city\" can not be emptys.")
	 private String city;
	
	 @NotNull(message = "Field \"state\" can not be emptys.")
	 private String state;
	
	 @NotNull(message = "Field \"country\" can not be emptys.")
	 private String country;
}
