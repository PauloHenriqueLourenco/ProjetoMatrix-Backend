package br.com.projetomatrix.academico.models;

import java.util.List;

public class Boletim {
	
	private String codigo;
	private Aluno alunoAssociado;
	private Turma turmaAssociada;
	private List<Avaliacao> avaliacoes;
	
	public Boletim(String codigo, Aluno alunoAssociado, Turma turmaAssociada, List<Avaliacao> avaliacoes) {
		super();
		this.codigo = codigo;
		this.alunoAssociado = alunoAssociado;
		this.turmaAssociada = turmaAssociada;
		this.avaliacoes = avaliacoes;
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

	public Turma getTurmaAssociada() {
		return turmaAssociada;
	}

	public void setTurmaAssociada(Turma turmaAssociada) {
		this.turmaAssociada = turmaAssociada;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
}