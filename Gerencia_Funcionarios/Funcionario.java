package gerenciar_funcionarios;

public class Funcionario extends Pessoa{
	protected double salario;
	protected Departamento departamento;
	
	public Funcionario(String nome, int idade, double salario, Departamento departamento) {
		super(nome, idade);
		this.salario = salario;
		this.departamento = departamento;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public void exibirFuncionario() {
		super.exibirPessoa();
		System.out.println("Salário do funcionário: "+salario);
		departamento.exibirDepartamento();
	}
}
