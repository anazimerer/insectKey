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
@Table(name = "ramos")
public class Branches {
	
	@Column(name = "idRamos")	
	private Integer idBranch; 
	
	@Column(name = "texto")
	private String text; 
	
	@Column(name = "idEtapaRamos")
	private Integer idStageBranches; 
	
	@Column(name = "textoDoProximo")
	private String nextText;
	
	@Column(name = "numeroRamos")
	private String branchNumber;
	

}
