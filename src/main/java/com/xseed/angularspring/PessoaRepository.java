package com.xseed.angularspring;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface PessoaRepository extends Repository<PessoaModel, Integer> {
	
	List<PessoaModel>findAll();
	PessoaModel findById(int id);
	PessoaModel save(PessoaModel pessoa);
	void delete(PessoaModel pessoa);
	
	@Query("select p from PessoaModel p where p.nome like %?1% or p.sobrenome like %?1%")
	List<PessoaModel> findPessoaByNome(String nome);
}
