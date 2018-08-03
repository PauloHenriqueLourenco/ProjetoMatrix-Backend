package br.com.projetomatrix.academico.models;

public class Professor extends Pessoa {

	private Titulo titulo;

	public Professor(Titulo titulo) {
		super();
		this.titulo = titulo;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	
	
}
