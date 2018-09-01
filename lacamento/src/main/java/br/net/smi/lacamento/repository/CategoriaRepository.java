package br.net.smi.lacamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.smi.lacamento.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
