package br.com.springboot.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.springboot.database.model.ativos.Branches;

public interface IBranchesRepository extends JpaRepository<Branches, Integer> {
	
	@Query(value = "SELECT b from Branches as b where idEtapaRamos = idEtapaRamos")
	List<Branches> findBranchesByIdStageBranches(@Param("idEtapaRamos") Integer idEtapaRamos);
}
