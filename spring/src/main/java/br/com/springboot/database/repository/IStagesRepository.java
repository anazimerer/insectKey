package br.com.springboot.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.springboot.database.model.ativos.Stages;

public interface IStagesRepository extends JpaRepository<Stages, Integer> {

	@Query(value = "SELECT s from Stages as s where idOrdem = idOrdem and idEtapa = :idEtapa")
	List<Stages> findStagesByOrderAndStages(@Param("idOrdem") Integer idOrdem, @Param("idEtapa") Integer idEtapa);
}
