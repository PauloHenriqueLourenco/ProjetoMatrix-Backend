package br.com.projetomatrix.academico.models;

import java.util.List;

public class Curso {
	
	private List<Disciplina> disciplinasAssociadas;
	private Coordenador coordenador;
	private String codigo;
	private String descricao;
	private int cargaHoraria;
	private String ementa;
	private String bibliografia;
	
	public Curso(List<Disciplina> disciplinasAssociadas, Coordenador coordenador, String codigo, String descricao,
			int cargaHoraria, String ementa, String bibliografia) {
		this.disciplinasAssociadas = disciplinasAssociadas;
		this.coordenador = coordenador;
		this.codigo = codigo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
		this.bibliografia = bibliografia;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinasAssociadas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinasAssociadas = disciplinas;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

	public List<Disciplina> getDisciplinasAssociadas() {
		return disciplinasAssociadas;
	}

	public void setDisciplinasAssociadas(List<Disciplina> disciplinasAssociadas) {
		this.disciplinasAssociadas = disciplinasAssociadas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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