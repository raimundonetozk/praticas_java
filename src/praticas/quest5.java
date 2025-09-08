package praticas;

import java.util.Scanner;

public class quest5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        float n1 = sc.nextFloat();
	        System.out.print("Digite a segunda nota: ");
	        float n2 = sc.nextFloat();
	        System.out.print("Digite a terceira nota: ");
	        float n3 = sc.nextFloat();

	        System.out.print("Digite A para média aritmética ou P para média ponderada: ");
	        char tipo = sc.next().toUpperCase().charAt(0);

	        float media = calcularMedia(n1, n2, n3, tipo);
	        System.out.println("Média calculada: " + media);
	    }

	    public static float calcularMedia(float n1, float n2, float n3, char tipo) {
	        if (tipo == 'A') {
	            return (n1 + n2 + n3) / 3;
	        } else if (tipo == 'P') {
	            return (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
	        } else {
	            System.out.println("Opção inválida!");
	            return 0;
	        }
	    }
	}