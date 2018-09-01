package br.net.smi.lacamento.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LancamentoDTO {

	private Long id;
	private Long idEmpresa;
	private Long idCategoria;
	private String tipo;
	private LocalDate vencimento;
	private BigDecimal valor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getVencimento() {
		return vencimento;
	}
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}