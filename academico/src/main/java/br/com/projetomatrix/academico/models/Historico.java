package br.com.projetomatrix.academico.models;

public class Historico {

	private Boletim[] boletins;

	public Historico(Boletim[] boletins) {
		this.boletins = boletins;
	}

	public Boletim[] getBoletins() {
		return boletins;
	}

	public void setBoletins(Boletim[] boletins) {
		this.boletins = boletins;
	}	
}