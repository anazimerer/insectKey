package br.com.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TermsResponse {
	
	private Integer idTerm; 
	private String termName;
	private String imagPath;
}
