package quest5;

public class Curso {
	String nome;
	String horario;
	Professor professor;
	Aluno[] alunos;
	
	public Curso(String nome, String horario, Professor professor, int quantAlunos) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = new Aluno[quantAlunos];
	}
	public double MediaTurma() {
		double soma=0;
		for(int i=0; i < alunos.length; i++) {
			soma += alunos[i].Media();
		}
		return soma/ alunos.length;
	}
	
}
