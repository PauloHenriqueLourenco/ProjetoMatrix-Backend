package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.Horario;

public class HorarioService {
	
	private Map<String, Horario> HorarioHash = new HashMap<>();

	private Long sequencial = new Long(0);

	public Horario cadastrarHorario(Horario Horario) {
		if (Horario == null || HorarioHash.containsKey(Horario.getCodigo()))
			return Horario;

		sequencial.sum(sequencial, 1);

		Horario.setCodigo(sequencial.toString());

		HorarioHash.put(Horario.getCodigo(), Horario);

		return Horario;
	}

	public Horario recuperarHorario(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		return HorarioHash.get(codigo);
	}

	public Horario atualizarHorario(Horario Horario) {
		if (Horario == null || Horario.getCodigo() == null || Horario.getCodigo().length() == 0)
			throw new IllegalArgumentException();

		removerHorario(Horario.getCodigo());
		cadastrarHorario(Horario);

		return Horario;
	}

	public void removerHorario(String codigo) {
		if (codigo == null || codigo.length() == 0)
			throw new IllegalArgumentException();

		HorarioHash.remove(codigo);
	}
}
