package quest5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor prof = new Professor("João Silva", "Computação", "joao@universidade.com");
        Curso curso = new Curso("POO", "Segundas 19h", prof, 5);

        for (int i = 0; i < curso.alunos.length; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a matrícula de " + nome + ": ");
            String matricula = sc.nextLine();

            curso.alunos[i] = new Aluno(nome, matricula);
            curso.alunos[i].LerNota(sc);
        }

        System.out.println("\n=== Resultados dos Alunos ===");
        for (int i = 0; i < curso.alunos.length; i++) {
            double media = curso.alunos[i].Media();
            System.out.printf("Aluno: %s | Média: %.2f | %s\n",
                    curso.alunos[i].nome,
                    media,
                    curso.alunos[i].Resultado() ? "APROVADO" : "REPROVADO");
        }

        System.out.printf("\nMédia da turma: %.2f\n", curso.MediaTurma());

        sc.close();
    }
}
