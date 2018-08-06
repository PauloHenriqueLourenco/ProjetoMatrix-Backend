package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Historico;

public class HistoricoService {
	private Map<String, Historico> HistoricoHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Historico cadastrarHistorico(Historico historico) {
		if (historico == null || HistoricoHash.containsKey(historico.getCodigo()))
			return historico;

		sequencial.sum(sequencial, 1);

		historico.setCodigo(sequencial.toString());

		HistoricoHash.put(historico.getCodigo(), historico);

		return historico;
	}

	public Historico recuperarHistorico(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		return HistoricoHash.get(codigo);
	}

	public Historico atualizarHistorico(Historico historico) {
		if (historico == null || historico.getCodigo() == null || historico.getCodigo().length() == 0)
			throw new IllegalArgumentException();

		removerHistorico(historico.getCodigo());
		cadastrarHistorico(historico);

		return historico;
	}

	public void removerHistorico(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		HistoricoHash.remove(codigo);
	}
	
	public Historico getHistoricoAluno(Aluno aluno) {
		if (aluno == null || aluno.getMatricula() == null || aluno.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		Historico historico = HistoricoHash.entrySet().stream()
				.filter(h -> h.getValue().getAlunoAssociado() == aluno)
				.map(h->h.getValue())
				.findAny()
				.orElse(null);
		
		return historico;
	}
}