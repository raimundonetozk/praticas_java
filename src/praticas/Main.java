package raio;
import java.util.Scanner;
import java.util.Locale;
import util.Calculator;
public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o raio: ");
		Double raio = sc.nextDouble();
		
		Double c = Calculator.circunferencia(raio);
		
		Double v = Calculator.volume(raio);
		
		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.5f%n", Calculator.PI);
		
	}
	
}

