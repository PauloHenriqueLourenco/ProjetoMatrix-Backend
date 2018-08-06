package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.Curso;

public class CursoService {
	
	private Map<String, Curso> CursoHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Curso cadastrarCurso(Curso curso) {
		if (curso == null || CursoHash.containsKey(curso.getCodigo()))
			return curso;

		sequencial.sum(sequencial, 1);

		curso.setCodigo(sequencial.toString());

		CursoHash.put(curso.getCodigo(), curso);

		return curso;
	}

	public Curso recuperarCurso(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		return CursoHash.get(codigo);
	}

	public Curso atualizarCurso(Curso curso) {
		if (curso == null || curso.getCodigo() == null || curso.getCodigo().length() == 0)
			throw new IllegalArgumentException();

		removerCurso(curso.getCodigo());
		cadastrarCurso(curso);

		return curso;
	}

	public void removerCurso(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		CursoHash.remove(codigo);
	}
}
