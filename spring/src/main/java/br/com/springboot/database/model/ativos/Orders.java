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
@Table(name = "ordens")
public class Orders {
	
	@Column(name = "idOrdem")	
	private Integer idOrdem; 
	
	@Column(name = "nomeOrdem")
	private String nomeOrdem; 
	
	@Column(name = "idChave")
	private Integer idChave; 

}
