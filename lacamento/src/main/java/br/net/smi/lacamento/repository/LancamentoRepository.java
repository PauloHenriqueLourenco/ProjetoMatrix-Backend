package br.net.smi.lacamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.smi.lacamento.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
}
