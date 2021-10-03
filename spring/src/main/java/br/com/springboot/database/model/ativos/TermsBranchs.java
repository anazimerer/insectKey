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
@Table(name = "termosRamos")
public class TermsBranchs {
	
	@Column(name = "idTermoRamo")	
	private Integer idTermoRamo; 
	
	@Column(name = "idTermo")	
	private Integer idTermo; 
	
	@Column(name = "idRamo")	
	private Integer idRamo; 
}
