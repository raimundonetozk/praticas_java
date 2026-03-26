package aluno_e_curso;

public class Curso {
	private String nome;
	private int cargaHoraria;
	public Curso(String nome, int cargaHoraria) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public void exibirCurso() {
		System.out.println("Curso: " + nome);
		System.out.println("Carga horária do curso: " + cargaHoraria);
		System.out.println("---------------");
	}
}
