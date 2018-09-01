package br.net.smi.lacamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.net.smi.lacamento.model.Empresa;
import br.net.smi.lacamento.repository.EmpresaRepository;

public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public Empresa salvar(Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	public List<Empresa> listar() {
		return empresaRepository.findAll();
	}

	public void remover(Long id) {
		empresaRepository.deleteById(id);		
	}

	public Empresa atualizar(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
}