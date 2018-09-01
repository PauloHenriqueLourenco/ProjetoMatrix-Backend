package br.net.smi.lacamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.smi.lacamento.model.Categoria;
import br.net.smi.lacamento.repository.CategoriaRepository;

public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria salvar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	public List<Categoria> listar() {
		return categoriaRepository.findAll();
	}

	public void remover(Long id) {
		categoriaRepository.deleteById(id);
	}

	public Categoria atualizar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
