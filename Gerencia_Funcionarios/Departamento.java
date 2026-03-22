package gerenciar_funcionarios;

public class Departamento {
	private String nome;
	private int andar;
	public Departamento(String nome, int andar) {
		this.nome = nome;
		this.andar = andar;
	}
	public void exibirDepartamento() {
		System.out.println("Nome do departamento: "+nome);
		System.out.println("Andar do departamento: "+andar);
	}
}
