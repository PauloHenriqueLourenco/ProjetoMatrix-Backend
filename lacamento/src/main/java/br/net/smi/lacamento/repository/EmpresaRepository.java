package br.net.smi.lacamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.smi.lacamento.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	Empresa findByNomeIgnoreCaseContaining(String nome);
	Empresa findByCnpj(String cnpj);
}
