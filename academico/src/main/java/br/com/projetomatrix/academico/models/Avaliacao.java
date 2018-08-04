package br.com.projetomatrix.academico.models;

import java.util.Date;

public class Avaliacao {

	private Aluno alunoAssociado;
	private Turma turmaAssociada;
	private int codigo;
	private Date dataRealizacao;
	private String descricao;
	private ModoAvaliacao modo;
	private Professor responsavel;
	
	public Avaliacao(Aluno alunoAssociado, Turma turmaAssociada, int codigo, Date dataRealizacao, String descricao,
			ModoAvaliacao modo, Professor responsavel) {
		this.alunoAssociado = alunoAssociado;
		this.turmaAssociada = turmaAssociada;
		this.codigo = codigo;
		this.dataRealizacao = dataRealizacao;
		this.descricao = descricao;
		this.modo = modo;
		this.responsavel = responsavel;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ModoAvaliacao getModo() {
		return modo;
	}

	public void setModo(ModoAvaliacao modo) {
		this.modo = modo;
	}

	public Professor getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}
}