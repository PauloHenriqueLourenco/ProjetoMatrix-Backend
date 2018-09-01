package br.net.smi.lacamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.smi.lacamento.model.Empresa;
import br.net.smi.lacamento.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public Empresa salvar(Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	public List<Empresa> listar() {
		return empresaRepository.findAll();
	}
	
	public Empresa listarPorId(Long id) {
		return empresaRepository.findById(id).get();
	}
	
	public Empresa listarPorNome(String nome) {
		return empresaRepository.findByNomeIgnoreCaseContaining(nome);
	}
	
	public Empresa listarPorCnpj(String cnpj) {
		return empresaRepository.findByCnpj(cnpj);
	}

	public void remover(Long id) {
		empresaRepository.deleteById(id);		
	}

	public Empresa atualizar(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
}