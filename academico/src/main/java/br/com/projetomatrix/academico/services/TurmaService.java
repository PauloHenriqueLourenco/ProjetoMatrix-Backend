package br.com.projetomatrix.academico.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Avaliacao;
import br.com.projetomatrix.academico.models.Professor;
import br.com.projetomatrix.academico.models.Turma;

public class TurmaService {

	private Map<String, Turma> turmaHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Turma cadastrarTurma(Turma turma) {
		if (turma == null || turmaHash.containsKey(turma.getCodigo()))
			return turma;

		sequencial.sum(sequencial, 1);

		turma.setCodigo(sequencial.toString());

		turmaHash.put(turma.getCodigo(), turma);

		return turma;
	}

	public Turma recuperarTurma(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		return turmaHash.get(codigo);
	}

	public Turma atualizarTurma(Turma turma) {
		if (turma == null || turma.getCodigo() == null || turma.getCodigo().length() == 0)
			throw new IllegalArgumentException();

		removerTurma(turma.getCodigo());
		cadastrarTurma(turma);

		return turma;
	}

	public void removerTurma(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		turmaHash.remove(codigo);
	}

	public List<Turma> getTurmasAlunoInscrito(Aluno aluno) {
		if (aluno == null || aluno.getMatricula() == null || aluno.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		Map<String, Turma> turmasInscritoMap = turmaHash.entrySet().stream()
				.filter(t -> t.getValue().getAlunos().contains(aluno))
				.collect(Collectors.toMap(t -> t.getKey(), t -> t.getValue()));
		
		List<Turma> turmasInscrito = new ArrayList<Turma>(turmasInscritoMap.values());
		
		return turmasInscrito;
	}
	
	public List<Turma> getTurmasProfessorInscrito(Professor professor) {
		if (professor == null || professor.getMatricula() == null || professor.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		Map<String, Turma> turmasInscritoMap = turmaHash.entrySet().stream()
				.filter(t -> t.getValue().getProfessorAssociado() == professor)
				.collect(Collectors.toMap(t -> t.getKey(), t -> t.getValue()));
		
		List<Turma> turmasInscrito = new ArrayList<Turma>(turmasInscritoMap.values());
		
		return turmasInscrito;
	}
}