package br.com.projetomatrix.academico.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Avaliacao;
import br.com.projetomatrix.academico.models.StatusAcademico;

public class AlunoService {

	private Map<String, Aluno> alunoHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Aluno cadastrarAluno(Aluno aluno) {
		if (validaAluno(aluno) == false)
			throw new IllegalArgumentException();

		aluno.setMatricula(gerarMatricula(aluno));

		alunoHash.put(aluno.getMatricula(), aluno);

		return aluno;
	}

	public Aluno recuperarAluno(String matricula) {
		if (validaMatricula(matricula) == false)
			throw new IllegalArgumentException();

		return alunoHash.get(matricula);
	}

	public Aluno atualizarAluno(Aluno aluno) {
		if (validaAluno(aluno) == false)
			throw new IllegalArgumentException();

		removerAluno(aluno.getMatricula());
		cadastrarAluno(aluno);

		return aluno;
	}

	public void removerAluno(String matricula) {
		if (validaMatricula(matricula) == false)
			throw new IllegalArgumentException();

		alunoHash.remove(matricula);
	}

	public BigDecimal calcularMedia(String matricula) {
		if (validaMatricula(matricula) == false)
			throw new IllegalArgumentException();

		Aluno aluno = alunoHash.get(matricula);
		List<Avaliacao> avaliacoes = aluno.getAvaliacoes();

		BigDecimal somaDasNotas = BigDecimal.ZERO;

		avaliacoes.forEach(avaliacao -> {
			somaDasNotas.add(avaliacao.getNota());
		});

		return somaDasNotas.divide(BigDecimal.valueOf(3), BigDecimal.ROUND_HALF_UP);
	}

	public StatusAcademico getStatusAcademico(String matricula) {
		if (validaMatricula(matricula) == false)
			throw new IllegalArgumentException();

		Aluno aluno = alunoHash.get(matricula);
		List<Avaliacao> avaliacoes = aluno.getAvaliacoes();

		StatusAcademico statusAcademico;

		if (avaliacoes.size() < 3)
			statusAcademico = StatusAcademico.REPROVADO;
		else if (calcularMedia(matricula).compareTo(BigDecimal.valueOf(6)) >= 0)
			statusAcademico = StatusAcademico.APROVADO;
		else if (calcularMedia(matricula).compareTo(BigDecimal.valueOf(4)) >= 0)
			statusAcademico = StatusAcademico.PROVA_FINAL;
		else
			statusAcademico = StatusAcademico.REPROVADO;
		
		return statusAcademico;
	}
	
	public boolean validaMatricula(String matricula) {
		return matricula != null && matricula.length() > 0;
	}

	public boolean validaAluno(Aluno aluno) {
		return aluno != null && aluno.getMatricula() != null && aluno.getMatricula().length() > 0;
	}

	public String gerarMatricula(Aluno aluno) {

		String ano = Integer.toString(LocalDateTime.now().getYear());

		int mes = LocalDateTime.now().getMonthValue();
		String semestre = mes <= 6 ? "1" : "2";

		sequencial.sum(sequencial, 1);

		return ano + semestre + sequencial.intValue();
	}
}