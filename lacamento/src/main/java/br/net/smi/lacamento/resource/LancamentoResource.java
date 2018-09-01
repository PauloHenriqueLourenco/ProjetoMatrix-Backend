package br.net.smi.lacamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.net.smi.lacamento.model.Lancamento;
import br.net.smi.lacamento.service.LancamentoService;

public class LancamentoResource {
	
	@Autowired
	private LancamentoService lancamentoService;
	
	@PostMapping(path = "/lancamentos")
	public ResponseEntity<Lancamento> criarLancamento(@RequestBody Lancamento lancamento) {
		Lancamento lancamentoNova = lancamentoService.salvar(lancamento);
		return new ResponseEntity<>(lancamentoNova, HttpStatus.CREATED);
	}
	
	@GetMapping("/lancamentos")
	public ResponseEntity<List<Lancamento>> getLancamentos(){
		List<Lancamento> lancamentos = lancamentoService.listar();
		return new ResponseEntity<List<Lancamento>>(lancamentos, HttpStatus.OK);
	}
	
	@DeleteMapping("/lancamentos/{id}")
	public ResponseEntity<?> removerLancamento(@PathVariable Long id){
		lancamentoService.remover(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/lancamentos")
	public ResponseEntity<Lancamento> atualizarLancamento(@RequestBody Lancamento lancamento){
		Lancamento lancamentoNova = lancamentoService.atualizar(lancamento);
		return new ResponseEntity<Lancamento>(lancamentoNova, HttpStatus.OK);
	}
}
