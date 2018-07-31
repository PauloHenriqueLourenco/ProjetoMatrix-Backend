package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CalculadoraSalario {

	public List<faixaSalarialINNS> tabelaINSS = Arrays.asList(
			new faixaSalarialINNS(BigDecimal.ZERO, BigDecimal.valueOf(1693.72), BigDecimal.valueOf(8.0)),
			new faixaSalarialINNS(BigDecimal.valueOf(1693.73), BigDecimal.valueOf(2822.90), BigDecimal.valueOf(9.0)),
			new faixaSalarialINNS(BigDecimal.valueOf(2822.91), BigDecimal.valueOf(Double.MAX_VALUE),
					BigDecimal.valueOf(11.0)));

	public List<faixaEtariaPlanoDeSaude> tabelaPlanoDeSaude = Arrays.asList(
			new faixaEtariaPlanoDeSaude(0, 9, BigDecimal.valueOf(75.00)),
			new faixaEtariaPlanoDeSaude(10, 19, BigDecimal.valueOf(112.50)),
			new faixaEtariaPlanoDeSaude(20, 29, BigDecimal.valueOf(168.75)),
			new faixaEtariaPlanoDeSaude(30, 39, BigDecimal.valueOf(253.13)),
			new faixaEtariaPlanoDeSaude(40, 49, BigDecimal.valueOf(379.69)),
			new faixaEtariaPlanoDeSaude(50, 59, BigDecimal.valueOf(569.54)),
			new faixaEtariaPlanoDeSaude(60, Integer.MAX_VALUE, BigDecimal.valueOf(854.30)));

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {

		if (salarioBruto == null || percentualImpostoINSS == null)
			throw new IllegalArgumentException();

		return salarioBruto.subtract(salarioBruto.multiply(percentualImpostoINSS).divide(BigDecimal.valueOf(100.0),
				BigDecimal.ROUND_HALF_UP)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public BigDecimal getValorINSS(BigDecimal salarioBruto) {

		if (salarioBruto == null)
			throw new IllegalArgumentException();

		BigDecimal percentualINSS = tabelaINSS.stream()
				.filter(t -> salarioBruto.compareTo(t.getSalarioInicial()) >= 0
						&& salarioBruto.compareTo(t.getSalarioFinal()) <= 0)
				.map(faixaSalarialINNS::getPercentualINSS).findAny().orElse(null);

		return salarioBruto.multiply(percentualINSS).divide(BigDecimal.valueOf(100), BigDecimal.ROUND_HALF_UP)
				.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public BigDecimal getValorPlanoDeSaude(Integer idade) {

		BigDecimal valorPlanoDeSaude = tabelaPlanoDeSaude.stream()
				.filter(t -> idade >= t.getIdadeInicial() && idade <= t.getIdadeFinal())
				.map(faixaEtariaPlanoDeSaude::getPreco).findAny().orElse(null);

		return valorPlanoDeSaude.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	class faixaSalarialINNS {

		private BigDecimal salarioInicial;
		private BigDecimal salarioFinal;
		private BigDecimal percentualINSS;

		public faixaSalarialINNS(BigDecimal salarioInicial, BigDecimal salarioFinal, BigDecimal percentualINSS) {
			this.salarioInicial = salarioInicial;
			this.salarioFinal = salarioFinal;
			this.percentualINSS = percentualINSS;
		}

		public BigDecimal getSalarioInicial() {
			return salarioInicial;
		}

		public void setSalarioInicial(BigDecimal salarioInicial) {
			this.salarioInicial = salarioInicial;
		}

		public BigDecimal getSalarioFinal() {
			return salarioFinal;
		}

		public void setSalarioFinal(BigDecimal salarioFinal) {
			this.salarioFinal = salarioFinal;
		}

		public BigDecimal getPercentualINSS() {
			return percentualINSS;
		}

		public void setPercentualINSS(BigDecimal percentualINSS) {
			this.percentualINSS = percentualINSS;
		}
	}

	class faixaEtariaPlanoDeSaude {

		private int idadeInicial;
		private int idadeFinal;
		private BigDecimal preco;

		public faixaEtariaPlanoDeSaude(int idadeInicial, int idadeFinal, BigDecimal preco) {
			this.idadeInicial = idadeInicial;
			this.idadeFinal = idadeFinal;
			this.preco = preco;
		}

		public int getIdadeInicial() {
			return idadeInicial;
		}

		public void setIdadeInicial(int idadeInicial) {
			this.idadeInicial = idadeInicial;
		}

		public int getIdadeFinal() {
			return idadeFinal;
		}

		public void setIdadeFinal(int idadeFinal) {
			this.idadeFinal = idadeFinal;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}
	}
}