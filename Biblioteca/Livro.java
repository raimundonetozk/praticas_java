package biblioteca;

public class Livro {
	private String titulo;
	private String genero;
	private int anoPubli;
	private Autor autor; 
	
	public Livro(String titulo, String genero, int anoPubli, Autor autor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.anoPubli = anoPubli;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoPubli() {
		return anoPubli;
	}

	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}

	public Autor getAutor() {
		return autor;
	}

	public void exibirDados() {
		System.out.println("Título: " + titulo);
		System.out.println("Gênero: " + genero);
		System.out.println("Ano de publicação: " + anoPubli);
		System.out.println("Informações do autor: ");
		autor.exibirAutor();
		System.out.println("--------------------------------");
	}
}
