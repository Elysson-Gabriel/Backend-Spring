package com.xseed.angularspring;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PessoaRepository extends Repository<PessoaModel, Integer> {
	
	List<PessoaModel>findAll();
	PessoaModel findById(int id);
	PessoaModel save(PessoaModel pessoa);
	void delete(PessoaModel pessoa);
	
}
