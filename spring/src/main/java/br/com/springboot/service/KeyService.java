package br.com.springboot.service;

import java.util.List;

import br.com.springboot.database.model.ativos.Orders;
import br.com.springboot.database.model.ativos.Terms;
import br.com.springboot.dto.BranchesResponse;

public interface KeyService {

	List<Orders> getOrders() throws Exception; 
	BranchesResponse getBranches(Integer idOrdem, Integer idEtapa);
	Terms getTermsById(Integer idTermo) throws Exception;    
	
}
