package br.com.projetomatrix.academico.models;

public class Curso {
	
	private Disciplina[] disciplinasAssociadas;
	private Coordenador coordenador;
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private String ementa;
	private String bibliografia;
	
	public Curso(Disciplina[] disciplinas, Coordenador coordenador) {
		this.disciplinasAssociadas = disciplinas;
		this.coordenador = coordenador;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinasAssociadas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinasAssociadas = disciplinas;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

	public Disciplina[] getDisciplinasAssociadas() {
		return disciplinasAssociadas;
	}

	public void setDisciplinasAssociadas(Disciplina[] disciplinasAssociadas) {
		this.disciplinasAssociadas = disciplinasAssociadas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
}