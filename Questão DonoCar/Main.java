package reforco1;

public class Main {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("João", 17, "1234567890");
		
		Carro car = new Carro("Ferrari", p);
		
		System.out.println("Dados do carro: " + car);
	}
}
