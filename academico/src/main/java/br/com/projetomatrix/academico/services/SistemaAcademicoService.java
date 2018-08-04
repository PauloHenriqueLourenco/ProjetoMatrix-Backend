package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.models.*;

public class SistemaAcademicoService {
	
	public Map<Integer, Aluno> aluno = new HashMap<Integer, Aluno>();
	public Map<Integer, Avaliacao> avaliacao = new HashMap<Integer, Avaliacao>();
	public Map<Integer, Boletim> boletim = new HashMap<Integer, Boletim>();
	public Map<Integer, Coordenador> coordenador = new HashMap<Integer, Coordenador>();
	public Map<Integer, Curso> curso = new HashMap<Integer, Curso>();
	public Map<Integer, Disciplina> disciplina = new HashMap<Integer, Disciplina>();
	public Map<Integer, Historico> historico = new HashMap<Integer, Historico>();
	public Map<Integer, Horario> horario = new HashMap<Integer, Horario>();
	public Map<Integer, Professor> professor = new HashMap<Integer, Professor>();
	public Map<Integer, Titulo> titulo = new HashMap<Integer, Titulo>();
	public Map<Integer, Turma> turma = new HashMap<Integer, Turma>();
	
	
	
}
