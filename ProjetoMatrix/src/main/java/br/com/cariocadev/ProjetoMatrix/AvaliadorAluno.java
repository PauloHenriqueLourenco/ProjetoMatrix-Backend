package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class AvaliadorAluno {

	public boolean validarNotas(BigDecimal... notas) {
		
		for (BigDecimal nota : notas)
			if (validarNota(nota) == false)
				return false;

		return true;
	}

	public boolean validarNota(BigDecimal nota) {
		return nota != null && nota.compareTo(BigDecimal.ZERO) >= 0 && nota.compareTo(BigDecimal.TEN) <= 0;
	}

	public BigDecimal getMaiorNota(BigDecimal[] notas) {

		if (notas == null || notas.length == 0)
			throw new IllegalArgumentException();

		Collections.sort(Arrays.asList(notas), Collections.reverseOrder());

		return notas[0];
	}

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {

		if (validarNotas(nota1, nota2, nota3) == false)
			throw new IllegalArgumentException();

		BigDecimal somaDasNotas = nota1.add(nota2.add(nota3));

		return somaDasNotas.divide(BigDecimal.valueOf(3), BigDecimal.ROUND_HALF_UP);
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {

		BigDecimal media = getMedia(nota1, nota2, nota3);

		String status;

		if (media.compareTo(BigDecimal.valueOf(6.0)) >= 0)
			status = "APROVADO";
		else if (media.compareTo(BigDecimal.valueOf(4.0)) >= 0)
			status = "PROVA_FINAL";
		else
			status = "REPROVADO";

		return status;
	}
}