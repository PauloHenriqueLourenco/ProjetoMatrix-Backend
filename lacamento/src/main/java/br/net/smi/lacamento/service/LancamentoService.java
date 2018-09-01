package br.net.smi.lacamento.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.smi.lacamento.model.Lancamento;
import br.net.smi.lacamento.model.LancamentoDTO;
import br.net.smi.lacamento.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private EmpresaService empresaService;
	
	public Lancamento salvar(LancamentoDTO lancamentoDTO) {
		Lancamento lancamento = new Lancamento();
		BeanUtils.copyProperties(lancamentoDTO, lancamento);
		lancamento.setCategoria(categoriaService.listarPorId(lancamentoDTO.getIdCategoria()));
		lancamento.setEmpresa(empresaService.listarPorId(lancamentoDTO.getIdEmpresa()));
		return lancamentoRepository.save(lancamento);
	}

	public List<Lancamento> listar() {
		return lancamentoRepository.findAll();
	}
	
	public Lancamento listarPorId(Long id) {
		return lancamentoRepository.findById(id).get();
	}
	
	public List<Lancamento> listarPorVencimentoEntre(LocalDate vencimentoInicial, LocalDate vencimentoFinal) {
		return lancamentoRepository.findByVencimentoBetween(vencimentoInicial, vencimentoFinal);
	}

	public void remover(Long id) {
		lancamentoRepository.deleteById(id);		
	}

	public Lancamento atualizar(Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);
	}
}
