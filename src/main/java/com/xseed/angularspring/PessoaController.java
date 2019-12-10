package com.xseed.angularspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/pessoas"})
public class PessoaController {

	@Autowired
	PessoaService service;
	
	@GetMapping
	public List<PessoaModel> consultar(){
		return service.consultar();
	}
	
	@PostMapping
	public PessoaModel adicionar(@RequestBody PessoaModel pessoa) {
		return service.adicionar(pessoa);
	}
	
	@GetMapping(path = {"/{id}"})
	public PessoaModel consultarId(@PathVariable("id") int id) {
		return service.consultarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public PessoaModel editar(@RequestBody PessoaModel pessoa, @PathVariable("id") int id) {
		pessoa.setId(id);
		return service.editar(pessoa);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public PessoaModel deletar(@PathVariable("id") int id) {
		return service.deletar(id);
	}
	
	@PostMapping(path = {"/pesquisarpessoa"})
	public List<PessoaModel> pesquisarNome(@RequestBody String nomepesquisa) {
		return service.findPessoaByNome(nomepesquisa);
	}
}
