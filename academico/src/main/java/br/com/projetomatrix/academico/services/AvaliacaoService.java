package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.Avaliacao;

public class AvaliacaoService {
	
	private Map<String, Avaliacao> AvaliacaoHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Avaliacao cadastrarAvaliacao(Avaliacao Avaliacao) {
		if (Avaliacao == null || AvaliacaoHash.containsKey(Avaliacao.getCodigo()))
			return Avaliacao;

		sequencial.sum(sequencial, 1);

		Avaliacao.setCodigo(sequencial.toString());

		AvaliacaoHash.put(Avaliacao.getCodigo(), Avaliacao);

		return Avaliacao;
	}

	public Avaliacao recuperarAvaliacao(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		return AvaliacaoHash.get(codigo);
	}

	public Avaliacao atualizarAvaliacao(Avaliacao Avaliacao) {
		if (Avaliacao == null || Avaliacao.getCodigo() == null || Avaliacao.getCodigo().length() == 0)
			throw new IllegalArgumentException();

		removerAvaliacao(Avaliacao.getCodigo());
		cadastrarAvaliacao(Avaliacao);

		return Avaliacao;
	}

	public void removerAvaliacao(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		AvaliacaoHash.remove(codigo);
	}
}
