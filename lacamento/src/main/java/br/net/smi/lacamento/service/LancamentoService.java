package br.net.smi.lacamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.smi.lacamento.model.Lancamento;
import br.net.smi.lacamento.repository.LancamentoRepository;

public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);
	}

	public List<Lancamento> listar() {
		return lancamentoRepository.findAll();
	}

	public void remover(Long id) {
		lancamentoRepository.deleteById(id);		
	}

	public Lancamento atualizar(Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);
	}
}
