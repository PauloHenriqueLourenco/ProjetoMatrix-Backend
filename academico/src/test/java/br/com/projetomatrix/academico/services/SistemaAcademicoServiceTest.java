package br.com.projetomatrix.academico.services;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

import br.com.projetomatrix.academico.models.*;

public class SistemaAcademicoServiceTest {

	@Test
	public void deveCalcularMedia() {
		SistemaAcademicoService sistema = new SistemaAcademicoService();

		Avaliacao avaliacao = sistema.cadastrarAvaliacao(new Avaliacao());
		avaliacao.setNota(BigDecimal.TEN);

		Aluno aluno = sistema.cadastrarAluno(new Aluno());

		aluno.adicionarAvaliacao(avaliacao);
		aluno.adicionarAvaliacao(avaliacao);
		aluno.adicionarAvaliacao(avaliacao);

		assertEquals(BigDecimal.TEN, sistema.calcularMedia("201820"));
	}

	@Test
	public void deveBuscarStatusAcademicoDoAluno() {
		SistemaAcademicoService sistema = new SistemaAcademicoService();

		Avaliacao avaliacao = sistema.cadastrarAvaliacao(new Avaliacao());

		Aluno aluno = sistema.cadastrarAluno(new Aluno());

		avaliacao.setNota(BigDecimal.valueOf(6.0));
		aluno.setAvaliacoes(Arrays.asList(avaliacao, avaliacao, avaliacao));
		assertEquals(StatusAcademico.APROVADO, sistema.getStatusAcademico("201820"));
		
		avaliacao.setNota(BigDecimal.valueOf(4.0));
		aluno.setAvaliacoes(Arrays.asList(avaliacao, avaliacao, avaliacao));
		assertEquals(StatusAcademico.PROVA_FINAL, sistema.getStatusAcademico("201820"));
		
		avaliacao.setNota(BigDecimal.valueOf(3.9));
		aluno.setAvaliacoes(Arrays.asList(avaliacao, avaliacao, avaliacao));
		assertEquals(StatusAcademico.REPROVADO, sistema.getStatusAcademico("201820"));
	}

}
