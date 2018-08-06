package br.com.projetomatrix.academico.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.embedded.SslStoreProvider;

public class Aluno extends Pessoa {

	private Curso cursoMatriculado;
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	public Aluno(Curso cursoMatriculado, List<Avaliacao> avaliacoes) {
		super();
		this.cursoMatriculado = cursoMatriculado;
		this.avaliacoes = avaliacoes;
	}

	public Aluno() {
		
	}
	
	public Curso getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(Curso cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	
	public Avaliacao adicionarAvaliacao(Avaliacao avaliacao) {
		avaliacoes.add(avaliacao);
		return avaliacao;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
}