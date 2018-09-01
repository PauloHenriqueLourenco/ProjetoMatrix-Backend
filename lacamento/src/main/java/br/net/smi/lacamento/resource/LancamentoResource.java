package br.net.smi.lacamento.resource;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.net.smi.lacamento.model.Lancamento;
import br.net.smi.lacamento.model.LancamentoDTO;
import br.net.smi.lacamento.service.LancamentoService;

@RestController
public class LancamentoResource {

	@Autowired
	private LancamentoService lancamentoService;

	@PostMapping(path = "/lancamentos")
	public ResponseEntity<Lancamento> criarLancamento(@RequestBody @Valid LancamentoDTO lancamentoDTO) {
		Lancamento lancamentoNova = lancamentoService.salvar(lancamentoDTO);
		return new ResponseEntity<>(lancamentoNova, HttpStatus.CREATED);
	}

	@GetMapping("/lancamentos")
	public ResponseEntity<List<Lancamento>> listarPorVencimento(
			@RequestParam("dataInicio") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dataInicio,
			@RequestParam("dataInicio") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate dataFim) {
		List<Lancamento> lancamentos = lancamentoService.listarPorVencimentoEntre(dataInicio, dataFim);
		return new ResponseEntity<List<Lancamento>>(lancamentos, HttpStatus.OK);
	}

	@DeleteMapping("/lancamentos/{id}")
	public ResponseEntity<?> removerLancamento(@PathVariable Long id) {
		lancamentoService.remover(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/lancamentos")
	public ResponseEntity<Lancamento> atualizarLancamento(@RequestBody Lancamento lancamento) {
		Lancamento lancamentoNova = lancamentoService.atualizar(lancamento);
		return new ResponseEntity<Lancamento>(lancamentoNova, HttpStatus.OK);
	}
}
