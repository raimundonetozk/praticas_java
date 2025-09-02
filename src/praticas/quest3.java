package praticas;
import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        System.out.println("\nEscolha uma opção:");
        System.out.println("a) Número de caracteres");
        System.out.println("b) String em MAIÚSCULO");
        System.out.println("c) String em minúsculo");
        System.out.println("d) Número de vogais");
        System.out.println("e) Começa com UE?");
        System.out.println("f) Imprimir inversa");

        char opcao = sc.next().toLowerCase().charAt(0);

        switch (opcao) {
            case 'a':
                System.out.println("Número de caracteres: " + texto.length());
                break;

            case 'b':
                System.out.println("Maiúscula: " + texto.toUpperCase());
                break;

            case 'c':
                System.out.println("Minúscula: " + texto.toLowerCase());
                break;

            case 'd':
                int contador = 0;
                for (int i = 0; i < texto.length(); i++) {
                    char c = Character.toLowerCase(texto.charAt(i));
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        contador++;
                    }
                }
                System.out.println("Número de vogais: " + contador);
                break;

            case 'e':
                String inicio = texto.length() >= 2 ? texto.substring(0, 2).toUpperCase() : "";
                if (inicio.equals("UE")) {
                    System.out.println("Começa com UE");
                } else {
                    System.out.println("Não começa com UE");
                }
                break;

            case 'f':
                String inversa = "";
                for (int i = texto.length() - 1; i >= 0; i--) {
                    inversa += texto.charAt(i);
                }
                System.out.println("Inversa: " + inversa);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}