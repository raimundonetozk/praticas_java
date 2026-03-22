package gerenciar_funcionarios;
import java.util.Scanner;

public class Leitor {
	
	public Funcionario lerFuncionario(Scanner sc) {
		System.out.println("Insira o nome do funcionário: ");
		String nome = sc.nextLine();
		
		System.out.println("Insira a idade do funcionário: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe o salário do funcionário: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Informe o nome do departamento: ");
		String dep = sc.nextLine();
		
		System.out.println("Informe o andar do departamento: ");
		int andar = sc.nextInt();
		sc.nextLine();
		
		Departamento departamento = new Departamento(dep, andar);
		
		return new Funcionario(nome, idade, salario, departamento);
	}
	
	public Gerente lerGerente(Scanner sc) {
		System.out.println("Insira o nome do Gerente: ");
		String nome = sc.nextLine();
		
		System.out.println("Insira a idade do Gerente: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe o salário do gerente: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Informe o nome do departamento: ");
		String dep = sc.nextLine();
		
		System.out.println("Informe o andar do departamento: ");
		int andar = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe o Bônus do gerente: ");
		double bonus = sc.nextDouble();
		sc.nextLine();
		
		Departamento departamento = new Departamento(dep, andar);
		
		return new Gerente(nome, idade, salario, departamento, bonus);
	}
}
