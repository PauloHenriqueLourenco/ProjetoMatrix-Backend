package br.net.smi.lacamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.net.smi.lacamento.model.Empresa;
import br.net.smi.lacamento.service.EmpresaService;

@RestController
public class EmpresaResource {
	
	@Autowired
	private EmpresaService empresaService;
	
	@PostMapping(path = "/empresas")
	public ResponseEntity<Empresa> criarEmpresa(@RequestBody Empresa empresa) {
		return new ResponseEntity<>(empresaService.salvar(empresa), HttpStatus.CREATED);
	}
	
	@GetMapping("/empresas")
	public ResponseEntity<List<Empresa>> getEmpresas(){
		return new ResponseEntity<List<Empresa>>(empresaService.listar(), HttpStatus.OK);
	}
	
/*	@GetMapping("/empresas")
	public ResponseEntity<Empresa> getEmpresaPorNome(@PathVariable String nome){
		return new ResponseEntity<>(empresaService.listarPorNome(nome), HttpStatus.OK);
	}*/
	
	@DeleteMapping("/empresas/{id}")
	public ResponseEntity<?> removerEmpresa(@PathVariable Long id){
		empresaService.remover(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/empresas")
	public ResponseEntity<Empresa> atualizarEmpresa(@RequestBody Empresa empresa){
		return new ResponseEntity<Empresa>(empresaService.atualizar(empresa), HttpStatus.OK);
	}
}
