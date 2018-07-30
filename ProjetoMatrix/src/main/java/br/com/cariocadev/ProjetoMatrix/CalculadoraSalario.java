package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		
		if(salarioBruto == null || percentualImpostoINSS == null)
			throw new IllegalArgumentException();
		
		BigDecimal salarioLiquido = salarioBruto.subtract(salarioBruto.multiply(percentualImpostoINSS).divide(new BigDecimal("100"), BigDecimal.ROUND_HALF_UP));
		
		return salarioLiquido.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	/*
	 * Dê preferencia para usar else if ao invés de aninhar dentro de 
	 * outro else.
	 * 
	 * Como desafio gostaria de ver uma nova implementação desse método sem o uso de ifs em cascata.
	 * Veja sobre Java 8 (filter)  
	 */
	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		
		if(salarioBruto == null) 
			throw new IllegalArgumentException();
			
		BigDecimal percentualINSS = BigDecimal.ZERO;
		
		if(salarioBruto.compareTo(new BigDecimal("1693.72")) <= 0) {
			percentualINSS = new BigDecimal("8.0");
		} else {
			if(salarioBruto.compareTo(new BigDecimal("2822.90")) <= 0) {
				percentualINSS = new BigDecimal("9.0");
			} else {
				percentualINSS = new BigDecimal("11.0");
			}
		}
		
		BigDecimal valorINSS = salarioBruto.multiply(percentualINSS).divide(new BigDecimal("100"), BigDecimal.ROUND_HALF_UP);
		
		return valorINSS.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	/*
	 * O método funciona mas esta muito complexo devido aos 
	 * ifs aninhados. 
	 * 
	 * Como desafio gostaria de ver uma nova implementação desse método sem o uso de ifs em cascata.
	 * Veja sobre Java 8 (filter)  
	 */
	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		
		BigDecimal valorPlanoDeSaude = BigDecimal.ZERO;
		
		if(idade <= 9) {
			valorPlanoDeSaude = new BigDecimal("75.00");
		} else {
			if(idade <= 19) {
				valorPlanoDeSaude = new BigDecimal("112.50");
			} else {
				if(idade <= 29) {
					valorPlanoDeSaude = new BigDecimal("168.75");
				} else {
					if(idade <= 39) {
						valorPlanoDeSaude = new BigDecimal("253.13");
					} else {
						if(idade <= 49) {
							valorPlanoDeSaude = new BigDecimal("379.69");
						} else {
							if(idade <= 59) {
								valorPlanoDeSaude = new BigDecimal("569.54");
							} else {
								valorPlanoDeSaude = new BigDecimal("854.30");
							}
						}
					}
				}
			}
		}
		
		return valorPlanoDeSaude.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
