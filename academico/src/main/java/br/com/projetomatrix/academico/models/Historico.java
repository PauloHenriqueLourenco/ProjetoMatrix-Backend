package br.com.projetomatrix.academico.models;

import java.util.List;

public class Historico {

	private String codigo;
	private Aluno alunoAssociado;
	private List<Boletim> boletins;

	public Historico(String codigo, Aluno alunoAssociado, List<Boletim> boletins) {
		super();
		this.codigo = codigo;
		this.alunoAssociado = alunoAssociado;
		this.boletins = boletins;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Aluno getAlunoAssociado() {
		return alunoAssociado;
	}

	public void setAlunoAssociado(Aluno alunoAssociado) {
		this.alunoAssociado = alunoAssociado;
	}

	public List<Boletim> getBoletins() {
		return boletins;
	}

	public void setBoletins(List<Boletim> boletins) {
		this.boletins = boletins;
	}	
}