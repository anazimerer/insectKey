package br.com.springboot.database.model.ativos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "etapa")
public class Stages {
	
	@Column(name = "idEtapaRamos")	
	private Integer idStageBranchs; 
	
	@Column(name = "idOrdemEtapa")	
	private Integer idOrderStage; 
	
	@Column(name = "next1")
	private String next1;
	
	@Column(name = "next2")
	private String next2; 
	
	@Column(name = "idOrdem")	
	private Integer idOrder; 
	
	@Column(name = "idEtapa")	
	private Integer idStage;

}