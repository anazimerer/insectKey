package br.com.springboot.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.database.model.ativos.Orders;

public interface IOrdersRepository extends JpaRepository<Orders, Integer> {
	
}
