package br.com.projetomatrix.academico.models;

import java.util.Date;
import java.util.List;

public class Turma {

	private Disciplina disciplinaAssociada;
	private Professor professorAssociado;
	private List<Aluno> alunos;
	private String codigo;
	private String anoLetivo;
	private int semestre;
	private Date dataAbertura;
	private Date dataEncerramento;
	private Horario horarioDeAula;
	
	public Turma(Disciplina disciplinaAssociada, Professor professorAssociado, List<Aluno> alunos, String codigo,
			String anoLetivo, int semestre, Date dataAbertura, Date dataEncerramento, Horario horarioDeAula) {
		this.disciplinaAssociada = disciplinaAssociada;
		this.professorAssociado = professorAssociado;
		this.alunos = alunos;
		this.codigo = codigo;
		this.anoLetivo = anoLetivo;
		this.semestre = semestre;
		this.dataAbertura = dataAbertura;
		this.dataEncerramento = dataEncerramento;
		this.horarioDeAula = horarioDeAula;
	}

	public Disciplina getDisciplinaAssociada() {
		return disciplinaAssociada;
	}

	public void setDisciplinaAssociada(Disciplina disciplinaAssociada) {
		this.disciplinaAssociada = disciplinaAssociada;
	}

	public Professor getProfessorAssociado() {
		return professorAssociado;
	}

	public void setProfessorAssociado(Professor professorAssociado) {
		this.professorAssociado = professorAssociado;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAnoLetivo() {
		return anoLetivo;
	}

	public void setAnoLetivo(String anoLetivo) {
		this.anoLetivo = anoLetivo;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public Horario getHorarioDeAula() {
		return horarioDeAula;
	}

	public void setHorarioDeAula(Horario horarioDeAula) {
		this.horarioDeAula = horarioDeAula;
	}
}