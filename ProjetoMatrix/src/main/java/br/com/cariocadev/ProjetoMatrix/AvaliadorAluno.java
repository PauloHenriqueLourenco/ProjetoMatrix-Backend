package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {

	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		
		if(notas == null) {
			throw new IllegalArgumentException();
		} else {
			BigDecimal maiorNota = notas[0];
			
			for(int i = 1; i < notas.length; i++) {
				if(notas[i].compareTo(maiorNota) > 0) {
					maiorNota = notas[i];
				}
			}
			
			return maiorNota;
		}		
	}

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		
		if(nota1 == null || nota2 == null || nota3 == null) {
			throw new IllegalArgumentException();
		} else {
			
			if(nota1.compareTo(BigDecimal.ZERO) < 0 || nota1.compareTo(BigDecimal.TEN) > 0 ||
				nota2.compareTo(BigDecimal.ZERO) < 0 || nota2.compareTo(BigDecimal.TEN) > 0 ||
				nota3.compareTo(BigDecimal.ZERO) < 0 || nota3.compareTo(BigDecimal.TEN) > 0) {
				throw new IllegalArgumentException();
			} else {
			
				BigDecimal somaNotas = nota1.add(nota2.add(nota3));
				somaNotas = somaNotas.setScale(2, BigDecimal.ROUND_HALF_UP);
				
				BigDecimal media = somaNotas.divide(new BigDecimal("3"), BigDecimal.ROUND_HALF_UP);
				
				media = media.setScale(2, BigDecimal.ROUND_HALF_UP);
			
				return media;
			}
		}
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		
		String status;
		
		BigDecimal media = getMedia(nota1, nota2, nota3);
		
		if (media.compareTo(new BigDecimal("6.00")) >= 0) {
			status = "APROVADO";
		} else {
			if (media.compareTo(new BigDecimal("4.00")) >= 0) {
				status = "PROVA_FINAL";
			} else {
				status = "REPROVADO";
			}
		}
		
		return status;
	}
	
	

}
