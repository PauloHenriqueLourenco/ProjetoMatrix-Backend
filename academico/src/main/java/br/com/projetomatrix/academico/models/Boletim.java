package br.com.projetomatrix.academico.models;

public class Boletim {
	
	private Aluno alunoAssociado;
	private Turma turmaAssociada;
	private Avaliacao[] avaliacoes;
	
	public Boletim(Aluno alunoAssociado, Turma turmaAssociada, Avaliacao[] avaliacoes) {
		this.alunoAssociado = alunoAssociado;
		this.turmaAssociada = turmaAssociada;
		this.avaliacoes = avaliacoes;
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

	public Avaliacao[] getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Avaliacao[] avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
}