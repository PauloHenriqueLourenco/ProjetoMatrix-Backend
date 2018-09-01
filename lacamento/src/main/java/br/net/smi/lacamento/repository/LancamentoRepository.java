package br.net.smi.lacamento.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.smi.lacamento.model.Lancamento;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
	List<Lancamento> findByVencimentoBetween(LocalDate vencimentoInicial, LocalDate vencimentoFinal);
	
}
