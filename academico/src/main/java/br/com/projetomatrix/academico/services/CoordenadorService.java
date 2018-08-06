package br.com.projetomatrix.academico.services;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.Coordenador;

public class CoordenadorService {
	
	private Map<String, Coordenador> CoordenadorHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Coordenador cadastrarCoordenador(Coordenador Coordenador) {
		if (Coordenador == null || CoordenadorHash.containsKey(Coordenador.getMatricula()))
			throw new IllegalArgumentException();

		Coordenador.setMatricula(gerarMatricula());

		CoordenadorHash.put(Coordenador.getMatricula(), Coordenador);

		return Coordenador;
	}

	public Coordenador recuperarCoordenador(String matricula) {
		if (matricula == null || matricula.length() == 0)
			throw new IllegalArgumentException();

		return CoordenadorHash.get(matricula);
	}

	public Coordenador atualizarCoordenador(Coordenador Coordenador) {
		if (Coordenador == null || Coordenador.getMatricula() == null || Coordenador.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		removerCoordenador(Coordenador.getMatricula());
		cadastrarCoordenador(Coordenador);

		return Coordenador;
	}

	public void removerCoordenador(String Matricula) {
		if (Matricula == null || Matricula.length() == 0)
			throw new IllegalArgumentException();

		CoordenadorHash.remove(Matricula);
	}

	public String gerarMatricula() {

		String ano = Integer.toString(LocalDateTime.now().getYear());

		int mes = LocalDateTime.now().getMonthValue();
		String semestre = mes <= 6 ? "1" : "2";

		sequencial.sum(sequencial, 1);

		return ano + semestre + sequencial.intValue();
	}
}
