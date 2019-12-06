package com.xseed.angularspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImp implements PessoaService{
	@Autowired
	private PessoaRepository repository;
	
	@Override
	public List<PessoaModel> consultar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public PessoaModel consultarId(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public PessoaModel adicionar(PessoaModel pessoa) {
		// TODO Auto-generated method stub
		return repository.save(pessoa);
	}

	@Override
	public PessoaModel editar(PessoaModel pessoa) {
		// TODO Auto-generated method stub
		return repository.save(pessoa);
	}

	@Override
	public PessoaModel deletar(int id) {
		// TODO Auto-generated method stub
		PessoaModel pessoa = repository.findById(id);
		if(pessoa != null) {
			repository.delete(pessoa);
		}
		return pessoa;
	}

}
