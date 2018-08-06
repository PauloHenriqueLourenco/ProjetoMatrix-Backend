package br.com.projetomatrix.academico.services;

import java.math.BigDecimal;
import java.util.List;

import br.com.projetomatrix.academico.models.*;

public class SistemaAcademicoService {

	private AlunoService alunoService = new AlunoService();
	private TurmaService turmaService = new TurmaService();
	private DisciplinaService disciplinaService = new DisciplinaService();
	private ProfessorService professorService = new ProfessorService();
	private CoordenadorService coordenadorService = new CoordenadorService();
	private CursoService cursoService = new CursoService();
	private HorarioService horarioService = new HorarioService();
	private AvaliacaoService avaliacaoService = new AvaliacaoService();
	private BoletimService boletimService = new BoletimService();
	private HistoricoService historicoService = new HistoricoService();

	// Aluno
	public Aluno cadastrarAluno(Aluno aluno) {
		return alunoService.cadastrarAluno(aluno);
	}

	public Aluno atualizarAluno(Aluno aluno) {
		return alunoService.atualizarAluno(aluno);
	}

	public void removerAluno(String matricula) {
		alunoService.removerAluno(matricula);
	}

	public Aluno recuperarAluno(String matricula) {
		return alunoService.recuperarAluno(matricula);
	}

	public BigDecimal calcularMedia(String matricula) {
		return alunoService.calcularMedia(matricula);
	}

	public StatusAcademico getStatusAcademico(String matricula) {
		return alunoService.getStatusAcademico(matricula);
	}
	
	public Avaliacao adicionarAvaliacao(Aluno aluno, Avaliacao avaliacao) {
		return aluno.adicionarAvaliacao(avaliacao);
	}

	// Turma
	public Turma cadastrarTurma(Turma turma) {
		return turmaService.cadastrarTurma(turma);
	}

	public Turma atualizarTurma(Turma turma) {
		return turmaService.atualizarTurma(turma);
	}

	public void removerTurma(String codigo) {
		turmaService.removerTurma(codigo);
	}

	public Turma recuperarTurma(String codigo) {
		return turmaService.recuperarTurma(codigo);
	}
	
	public List<Turma> getTurmasAlunoInscrito(Aluno aluno) {
		return turmaService.getTurmasAlunoInscrito(aluno);
	}
	
	public List<Turma> getTurmasProfessorInscrito(Professor professor) {
		return turmaService.getTurmasProfessorInscrito(professor);
	}

	// Disciplina
	public Disciplina cadastrarDisciplina(Disciplina disciplina) {
		return disciplinaService.cadastrarDisciplina(disciplina);
	}

	public Disciplina atualizarDisciplina(Disciplina disciplina) {
		return disciplinaService.atualizarDisciplina(disciplina);
	}

	public void removerDisciplina(String codigo) {
		disciplinaService.removerDisciplina(codigo);
	}

	public Disciplina recuperarDisciplina(String codigo) {
		return disciplinaService.recuperarDisciplina(codigo);
	}

	// Professor
	public Professor cadastrarProfessor(Professor professor) {
		return professorService.cadastrarProfessor(professor);
	}

	public Professor atualizarProfessor(Professor professor) {
		return professorService.atualizarProfessor(professor);
	}

	public void removerProfessor(String matricula) {
		professorService.removerProfessor(matricula);
	}

	public Professor recuperarProfessor(String matricula) {
		return professorService.recuperarProfessor(matricula);
	}

	// Coordenador
	public Coordenador cadastrarCoordenador(Coordenador coordenador) {
		return coordenadorService.cadastrarCoordenador(coordenador);
	}

	public Coordenador atualizarCoordenador(Coordenador coordenador) {
		return coordenadorService.atualizarCoordenador(coordenador);
	}

	public void removerCoordenador(String matricula) {
		coordenadorService.removerCoordenador(matricula);
	}

	public Coordenador recuperarCoordenador(String matricula) {
		return coordenadorService.recuperarCoordenador(matricula);
	}

	// Curso
	public Curso cadastrarCurso(Curso curso) {
		return cursoService.cadastrarCurso(curso);
	}

	public Curso atualizarCurso(Curso curso) {
		return cursoService.atualizarCurso(curso);
	}

	public void removerCurso(String codigo) {
		cursoService.removerCurso(codigo);
	}

	public Curso recuperarCurso(String codigo) {
		return cursoService.recuperarCurso(codigo);
	}

	// Horario
	public Horario cadastrarHorario(Horario horario) {
		return horarioService.cadastrarHorario(horario);
	}

	public Horario atualizarHorario(Horario horario) {
		return horarioService.atualizarHorario(horario);
	}

	public void removerHorario(String codigo) {
		horarioService.removerHorario(codigo);
	}

	public Horario recuperarHorario(String codigo) {
		return horarioService.recuperarHorario(codigo);
	}

	// Avaliacao
	public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao) {
		return avaliacaoService.cadastrarAvaliacao(avaliacao);
	}

	public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
		return avaliacaoService.atualizarAvaliacao(avaliacao);
	}

	public void removerAvaliacao(String codigo) {
		avaliacaoService.removerAvaliacao(codigo);
	}

	public Avaliacao recuperarAvaliacao(String codigo) {
		return avaliacaoService.recuperarAvaliacao(codigo);
	}

	// Boletim
	public Boletim cadastrarBoletim(Boletim boletim) {
		return boletimService.cadastrarBoletim(boletim);
	}

	public Boletim atualizarBoletim(Boletim boletim) {
		return boletimService.atualizarBoletim(boletim);
	}

	public void removerBoletim(String codigo) {
		boletimService.removerBoletim(codigo);
	}

	public Boletim recuperarBoletim(String codigo) {
		return boletimService.recuperarBoletim(codigo);
	}
	
	public Boletim getBoletimAluno(Aluno aluno) {
		return boletimService.getBoletimAluno(aluno);
	}

	// Historico
	public Historico cadastrarHistorico(Historico historico) {
		return historicoService.cadastrarHistorico(historico);
	}

	public Historico atualizarHistorico(Historico historico) {
		return historicoService.atualizarHistorico(historico);
	}

	public void removerHistorico(String codigo) {
		historicoService.removerHistorico(codigo);
	}

	public Historico recuperarHistorico(String codigo) {
		return historicoService.recuperarHistorico(codigo);
	}
	
	public Historico getHistoricoAluno(Aluno aluno) {
		return historicoService.getHistoricoAluno(aluno); 
	}
}