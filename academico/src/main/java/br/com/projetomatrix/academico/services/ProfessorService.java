package br.com.projetomatrix.academico.services;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Professor;

public class ProfessorService {
	
	private Map<String, Professor> ProfessorHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Professor cadastrarProfessor(Professor Professor) {
		if (Professor == null || ProfessorHash.containsKey(Professor.getMatricula()))
			throw new IllegalArgumentException();

		Professor.setMatricula(gerarMatricula());

		ProfessorHash.put(Professor.getMatricula(), Professor);

		return Professor;
	}

	public Professor recuperarProfessor(String matricula) {
		if (matricula == null || matricula.length() == 0)
			throw new IllegalArgumentException();

		return ProfessorHash.get(matricula);
	}

	public Professor atualizarProfessor(Professor Professor) {
		if (Professor == null || Professor.getMatricula() == null || Professor.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		removerProfessor(Professor.getMatricula());
		cadastrarProfessor(Professor);

		return Professor;
	}

	public void removerProfessor(String Matricula) {
		if (Matricula == null || Matricula.length() == 0)
			throw new IllegalArgumentException();

		ProfessorHash.remove(Matricula);
	}
	
	public String gerarMatricula() {

		String ano = Integer.toString(LocalDateTime.now().getYear());

		int mes = LocalDateTime.now().getMonthValue();
		String semestre = mes <= 6 ? "1" : "2";

		sequencial.sum(sequencial, 1);

		return ano + semestre + sequencial.intValue();
	}
}
