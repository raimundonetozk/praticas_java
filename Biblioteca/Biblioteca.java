package biblioteca;

public class Biblioteca {
	public static void main(String[] args) {
		Autor autor1 = new Autor("Carlos", 45);
		Autor autor2 = new Autor("Jonlyne", 32);
		Autor autor3 = new Autor("Gregory", 38);
		
		Livro[] livros = new Livro[3];
		livros[0] = new Livro("Naruto", "ação", 2001, autor1);
		livros[1] = new Livro("kafka", "psicologia", 1982, autor2);
		livros[2] = new Livro("Diário de um banana", "Comédia", 2007, autor3);
		
		for(int i=0;i < livros.length; i++) {
			livros[i].exibirDados();
		}
		
	}
}
