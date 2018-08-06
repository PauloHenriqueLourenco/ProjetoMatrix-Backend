package br.com.projetomatrix.academico.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Boletim;
import br.com.projetomatrix.academico.models.Turma;

public class BoletimService {
	private Map<String, Boletim> boletimHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Boletim cadastrarBoletim(Boletim boletim) {
		if (boletim == null || boletimHash.containsKey(boletim.getCodigo()))
			return boletim;

		sequencial.sum(sequencial, 1);

		boletim.setCodigo(sequencial.toString());

		boletimHash.put(boletim.getCodigo(), boletim);

		return boletim;
	}

	public Boletim recuperarBoletim(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		return boletimHash.get(codigo);
	}

	public Boletim atualizarBoletim(Boletim boletim) {
		if (boletim == null || boletim.getCodigo() == null || boletim.getCodigo().length() == 0)
			throw new IllegalArgumentException();

		removerBoletim(boletim.getCodigo());
		cadastrarBoletim(boletim);

		return boletim;
	}

	public void removerBoletim(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		boletimHash.remove(codigo);
	}
	
	public Boletim getBoletimAluno(Aluno aluno) {
		if (aluno == null || aluno.getMatricula() == null || aluno.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		Boletim boletim = boletimHash.entrySet().stream()
				.filter(b -> b.getValue().getAlunoAssociado() == aluno)
				.map(b->b.getValue())
				.findAny()
				.orElse(null);
		
		return boletim;
	}
}
