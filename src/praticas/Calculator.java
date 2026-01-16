package util;

public class Calculator {
	public Double PI = 3.14159;
	
	public Double circunferencia(Double raio) {
		return 2.0 * PI * raio;
	}
	public Double volume(Double raio) {
		return 4.0 * PI * raio * raio * raio/3;
	}
}
