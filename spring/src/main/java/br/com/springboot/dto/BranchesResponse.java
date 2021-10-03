package br.com.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BranchesResponse {
	
	private Integer idOrder; 
	private Integer idStage;
	private String next1;
	private String next2; 
	private Integer idBranchA; 
	private String textA; 
	private String nextTextA;
	private Integer idBranchB; 
	private String textB; 
	private String nextTextB;
	private Integer idStageBranches; 
}
