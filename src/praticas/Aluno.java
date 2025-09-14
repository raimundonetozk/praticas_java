package quest5;
import java.util.Scanner;

public class Aluno {
	String nome;
	String matricula;
	double[] notas = new double[4];
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public void LerNota(Scanner sc) {
		for(int i=0; i<4; i++) {
			System.out.println("Insira a" + (i+1) + "nota do aluno:");
			notas[i]= sc.nextDouble();
		}
	}
	public double Media() {
		double soma = 0;
		for(int i=0; i<notas.length;i++) {
			soma+= notas[i];
		}
		return soma/notas.length;
	}
	
	public boolean Resultado() {
		return Media() >= 7.0;
	}
}