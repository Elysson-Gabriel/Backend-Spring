package com.xseed.angularspring;

import java.util.List;

public interface PessoaService {
	
	List<PessoaModel> consultar();
	PessoaModel consultarId(int id);
	PessoaModel adicionar(PessoaModel pessoa);
	PessoaModel editar(PessoaModel pessoa);
	PessoaModel deletar(int id);
	
}
