package gerenciar_funcionarios;

public class Gerente extends Funcionario{
	private double bonus;

	public Gerente(String nome, int idade, double salario, Departamento departamento, double bonus) {
		super(nome, idade, salario, departamento);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void exibirGerente() {
		super.exibirFuncionario();
		System.out.println("Bônus do gerente: " + bonus);
	}
}
