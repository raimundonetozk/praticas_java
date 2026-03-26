package aluno_e_curso;

public class Aluno {
	private String nome;
	private int matricula;
	private Curso curso;
	public Aluno(String nome, int matricula, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void exibirAluno() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Matricula do aluno: " + matricula);
		curso.exibirCurso();
		System.out.println("---------------");
	}
}
