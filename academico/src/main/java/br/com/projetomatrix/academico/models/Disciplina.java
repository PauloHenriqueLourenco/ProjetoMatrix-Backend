package br.com.projetomatrix.academico.models;

import java.util.List;

public class Disciplina {

	private Curso cursoPertencente;
	private List<Professor> professoresAssociados;
	private String codigo;
	private List<Disciplina> pre_requisitos;
	private String descricao;
	
	public Disciplina(Curso cursoPertencente, List<Professor> professoresAssociados, String codigo,
			List<Disciplina> pre_requisitos, String descricao) {
		this.cursoPertencente = cursoPertencente;
		this.professoresAssociados = professoresAssociados;
		this.codigo = codigo;
		this.pre_requisitos = pre_requisitos;
		this.descricao = descricao;
	}
	
	public Curso getCursoPertencente() {
		return cursoPertencente;
	}
	
	public void setCursoPertencente(Curso cursoPertencente) {
		this.cursoPertencente = cursoPertencente;
	}
	
	public List<Professor> getProfessoresAssociados() {
		return professoresAssociados;
	}
	
	public void setProfessoresAssociados(List<Professor> professoresAssociados) {
		this.professoresAssociados = professoresAssociados;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public List<Disciplina> getPre_requisitos() {
		return pre_requisitos;
	}
	
	public void setPre_requisitos(List<Disciplina> pre_requisitos) {
		this.pre_requisitos = pre_requisitos;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}