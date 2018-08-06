package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.Disciplina;

public class DisciplinaService {

	private Map<String, Disciplina> DisciplinaHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Disciplina cadastrarDisciplina(Disciplina Disciplina) {
		if (Disciplina == null || DisciplinaHash.containsKey(Disciplina.getCodigo()))
			return Disciplina;

		sequencial.sum(sequencial, 1);

		Disciplina.setCodigo(sequencial.toString());

		DisciplinaHash.put(Disciplina.getCodigo(), Disciplina);

		return Disciplina;
	}

	public Disciplina recuperarDisciplina(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		return DisciplinaHash.get(codigo);
	}

	public Disciplina atualizarDisciplina(Disciplina Disciplina) {
		if (Disciplina == null || Disciplina.getCodigo() == null || Disciplina.getCodigo().length() == 0)
			throw new IllegalArgumentException();

		removerDisciplina(Disciplina.getCodigo());
		cadastrarDisciplina(Disciplina);

		return Disciplina;
	}

	public void removerDisciplina(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		DisciplinaHash.remove(codigo);
	}
}