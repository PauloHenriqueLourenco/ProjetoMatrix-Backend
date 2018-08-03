package br.com.projetomatrix.academico.models;

public class Disciplina {

	private Curso cursoPertencente;
	private Professor[] professoresAssociados;
	private int codigo;
	private Disciplina[] pre_requisitos;
	private String descricao;
	
	public Disciplina(Curso cursoPertencente, Professor[] professoresAssociados, int codigo,
			Disciplina[] pre_requisitos, String descricao) {
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
	
	public Professor[] getProfessoresAssociados() {
		return professoresAssociados;
	}
	
	public void setProfessoresAssociados(Professor[] professoresAssociados) {
		this.professoresAssociados = professoresAssociados;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Disciplina[] getPre_requisitos() {
		return pre_requisitos;
	}
	
	public void setPre_requisitos(Disciplina[] pre_requisitos) {
		this.pre_requisitos = pre_requisitos;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}