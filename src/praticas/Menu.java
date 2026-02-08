package string;
import java.util.Scanner;

public class Menu {
	public int opcao;
	public String palavra;
	Scanner sc = new Scanner(System.in);
	
	Menu(){
		
	}
	Menu(int opcao, String palavra){
		this.opcao = opcao;
		this.palavra = palavra;
	}
	public int getOpcao() {
		return opcao;
	}
	public String getPalavra() {
		return palavra;
	}
	
	public void escolha() {
		System.out.println("Insira uma palavra.");
		palavra = sc.nextLine();
		System.out.println("Escolha o que deseja fazer com a palavra inserida.");
		System.out.println("Para mostrar o número de caracteres da string, insira 1.");
		System.out.println("Para mostrar a string com todas as letras em maiusculo insira 2.");
		System.out.println("Para mostrar a string com todas as letras em minúsculo insira 3.");
		System.out.println("Para mostrar o número de vogais da string insira 4.");
		System.out.println("Para saber se a string começa com 'UE' insira 5.");
		System.out.println("Para mostrar a string inversa, insira 6.");
		System.out.println("Para encerrar o código insira 0.");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println(palavra.length());
			break;
		case 2:
			System.out.println(palavra.toUpperCase());
			break;
		case 3:
			System.out.println(palavra.toLowerCase());
			break;
		case 4:
			int contador = 0;
			String palavranova = palavra.toLowerCase();
			for(int i=0; i < palavranova.length(); i++) {
				if(palavranova.charAt(i) == 'a' || palavranova.charAt(i) == 'e' || palavranova.charAt(i) == 'i' || palavranova.charAt(i) == 'o' || palavranova.charAt(i) == 'u') {
					contador++;
				}
			}	System.out.println("A palavra tem " + contador + " vogais.");
			break;
		case 5:
			if(palavra.toLowerCase().startsWith("ue")) {
				System.out.println("Sim, a palavra começa com 'UE'.");
			}	System.out.println("A palavra não começa com 'UE'.");
			break;
		case 6:
			String inversa = "";
			for(int i = palavra.length()-1; i >= 0; i--) {
				inversa+= palavra.charAt(i);
			}	System.out.println("A palavra invertida é: "+ inversa);
			break;
		case 0:
			System.out.println("Encerrando o codigo..");
			break;
		default:
			System.out.println("Opção inválida!!!");
			System.out.println("Temte novamente.");
			break;
		}
		
	}
	
}
