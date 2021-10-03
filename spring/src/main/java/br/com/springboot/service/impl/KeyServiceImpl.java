package br.com.springboot.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.database.model.ativos.Branches;
import br.com.springboot.database.model.ativos.Orders;
import br.com.springboot.database.model.ativos.Stages;
import br.com.springboot.database.model.ativos.Terms;
import br.com.springboot.database.repository.IBranchesRepository;
import br.com.springboot.database.repository.IOrdersRepository;
import br.com.springboot.database.repository.IStagesRepository;
import br.com.springboot.database.repository.ITermsRepository;
import br.com.springboot.dto.BranchesResponse;
import br.com.springboot.service.KeyService;

@Service
public class KeyServiceImpl implements KeyService {

	@Autowired
	private IOrdersRepository ordersRepository;
	
	@Autowired
	private IStagesRepository stagesRepository;
	
	@Autowired
	private IBranchesRepository branchesRepository;
	
	
	@Autowired
	private ITermsRepository termsRepository;

	@Override
	public List<Orders> getOrders() throws Exception {
		return ordersRepository.findAll();
	}

	@Override
	public BranchesResponse getBranches(Integer idOrder, Integer idStage) {

		List<Stages> stage = stagesRepository.findStagesByOrderAndStages(idOrder, idStage);		
		List<Branches> branches = branchesRepository.findBranchesByIdStageBranches(stage.get(0).getIdStageBranchs());
		
		List<Branches> branchA = branches.stream().filter(obj -> obj.getBranchNumber().equalsIgnoreCase("a")).collect(Collectors.toList());
		List<Branches> branchB = branches.stream().filter(obj -> obj.getBranchNumber().equalsIgnoreCase("b")).collect(Collectors.toList());
		
		return BranchesResponse.builder()
				.idStage(idStage)
				.idOrder(idOrder)
				.next1(stage.get(0).getNext1())
				.next2(stage.get(0).getNext2())	
				.idBranchA(branchA.get(0).getIdBranch())
				.textA(branchA.get(0).getText())
				.nextTextA(branchA.get(0).getNextText())
				.idBranchB(branchB.get(0).getIdBranch())
				.textB(branchB.get(0).getText())
				.nextTextB(branchB.get(0).getNextText())
				.idStageBranches(stage.get(0).getIdStageBranchs())
				.build();	
	}
	
	public Terms getTermsById(Integer idTerm) throws Exception {	
		return termsRepository.findById(idTerm).get();
	}
	
	public List<Terms> getTermsListById(List<Integer> idsTerm) throws Exception {		
		return termsRepository.findAllById(idsTerm);
	}
	
	public void AddTemsOfStage(Integer idStage) {
		//ler cada texto
		// dar match com as palavras que tem no guia
		// add no banco 
		
	}
	
	
	
}
