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
@Table(name = "termos")
public class Terms {
	
	@Column(name = "idTermo")	
	private Integer idTerm; 
	
	@Column(name = "textoTermo")
	private String TermText; 
	
	@Column(name = "imagePath")
	private String imagePath; 
	
	@Column(name = "explicacaoTermo")
	private String explanationTerm;
}
