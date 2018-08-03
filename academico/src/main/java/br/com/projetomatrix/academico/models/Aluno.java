package br.com.projetomatrix.academico.models;

public class Aluno extends Pessoa {

	private Curso cursoMatriculado;

	public Aluno(Curso cursoMatriculado) {
		super();
		this.cursoMatriculado = cursoMatriculado;
	}

	public Curso getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(Curso cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}
}