package gerenciar_funcionarios;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Leitor leitor = new Leitor();
		
		Funcionario[] funcionarios = new Funcionario[3];
		Gerente[] gerentes = new Gerente[1];
		
		for(int i=0; i<funcionarios.length; i++) {
			funcionarios[i] = leitor.lerFuncionario(sc);
		}
		
		for(int i=0; i<gerentes.length; i++) {
			gerentes[i] = leitor.lerGerente(sc);
		}
		
		 System.out.println("\n--- FUNCIONÁRIOS ---");
	        for (int i= 0; i<funcionarios.length; i++) {
	        	funcionarios[i].exibirFuncionario();
	            System.out.println("----------------");
	        }

	        System.out.println("\n--- GERENTES ---");
	        for (int i=0; i< gerentes.length;i++) {
	            gerentes[i].exibirGerente();
	            System.out.println("----------------");
	        }

	}
}
