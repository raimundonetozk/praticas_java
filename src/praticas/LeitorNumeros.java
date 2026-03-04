package vetor;
import java.util.Scanner;

public class LeitorNumeros{
	private int[] numeros;
	private int quantidade;
	private Scanner sc;
	
	public LeitorNumeros(){
		numeros = new int[10];
		sc = new Scanner(System.in);
	}
	public void Executar() {
		LerQuantidade();
		LerNumeros();
		MostrarNegativos();
	}
	public void LerQuantidade() {
		System.out.println("Informe a quantidade de números: ");
		quantidade = sc.nextInt();
		while(quantidade < 1 || quantidade > 10) {
			System.out.println("Valor incorreto! Por favor insira um valor válido!");
			quantidade = sc.nextInt();
		}
	}
	
	public void LerNumeros() {
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Número "+ (i+1) + ":");
			numeros[i] = sc.nextInt();
		}
	}
	
	public void MostrarNegativos() {
		System.out.println("Numeros negativos: ");
		for(int i = 0; i <numeros.length; i++) {
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
	}
	
	
}