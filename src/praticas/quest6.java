package praticas;
import java.util.Scanner;

public class quest6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Scanner sci = new Scanner(System.in);
		System.out.println("Informe a String para acessar o menu: ");
		String string = sc.nextLine();
		System.out.println("(1) para mostrar o número de cacarteres da string.");
		System.out.println("(2) para mostrar a string com todas as letras em maiúsculo.");
		System.out.println("(3) para mostrar a string com todas as letras em minúsculo.");
		System.out.println("(4) para mostrar o número de vogais da string.");
		System.out.println("(5) para saber se a string começa com 'UE' .");
		System.out.println("(6) para imprimir a string inversa.");
		System.out.println("(0) para encerrar o programa.");
		int num = sci.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("número de caracteres da string: "+ string.length());
			break;
		case 2:
			System.out.println("String em maiúsculo: "+ string.toUpperCase());
			break;
		case 3:
			System.out.println("String em minúsculo: "+ string.toLowerCase());
			break;
		case 4:
			String newString = string.toLowerCase();
			int contador = 0;
			for(int i = 0; i <string.length();i++) {
				if(newString.charAt(i) == 'a'|| newString.charAt(i) == 'e' || newString.charAt(i) == 'i' || newString.charAt(i) == 'o' || newString.charAt(i) == 'u') {
					contador++;
				}	
			}
			System.out.println("Número de vogais da string:" + contador);
			break;
		case 5:
			if(string.toLowerCase().startsWith("ue")) {
				System.out.println("A string começa com 'UE' .");
			}	System.out.println("A string não começa com 'UE' .");
			break;
		case 6:
			String inversa = "";
			for(int i = string.length()-1; i>= 0; i--) {
				inversa += string.charAt(i);
			}
			System.out.println("A string inversa é: "+ inversa);
			break;
		case 0:
			System.out.println("Encerrando o programa..");
			break;
		default:
			System.out.println("Opção inválida!!! tente novamente");
		}
		
	}
	
}
