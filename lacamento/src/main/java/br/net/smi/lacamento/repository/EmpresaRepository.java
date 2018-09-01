package br.net.smi.lacamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.smi.lacamento.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
