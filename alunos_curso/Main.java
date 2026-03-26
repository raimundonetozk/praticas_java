package aluno_e_curso;

public class Main {
	public static void main(String[] args) {
		Curso c1 = new Curso("ADM", 202);
		Curso c2 = new Curso("Computação", 180);
		
		Aluno[] alunos = new Aluno[3];
		alunos[0] = new Aluno("Vitor", 21002, c1);
		alunos[1] = new Aluno("Lucas", 21200, c2);
		alunos[2] = new Aluno("Raimundo", 22031, c2);
		
		for(int i=0; i < alunos.length; i++) {
			alunos[i].exibirAluno();
		}
	}
}
