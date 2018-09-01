package br.net.smi.lacamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.net.smi.lacamento.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
