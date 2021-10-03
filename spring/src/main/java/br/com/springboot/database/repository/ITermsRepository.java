package br.com.springboot.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.database.model.ativos.Terms;

public interface ITermsRepository extends JpaRepository<Terms, Integer> {
	
	
}
