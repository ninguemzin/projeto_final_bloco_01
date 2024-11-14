package model;

public abstract class Livro {

	private int numero;
	private String titulo;
	private String autor;
	private int ano;
	private int formato;
	private String genero;
	private int numeropaginas;
	private float preco;

	public Livro(int numero, String titulo, String autor, int ano, int formato, String genero, int numeropaginas,
			float preco) {
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.formato = formato;
		this.genero = genero;
		this.numeropaginas = numeropaginas;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getFormato() {
		return formato;
	}

	public void setFormato(int formato) {
		this.formato = formato;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeropaginas() {
		return numeropaginas;
	}

	public void setNumeropaginas(int numeropaginas) {
		this.numeropaginas = numeropaginas;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizarLivro() {

		String formato = "";

		switch (this.formato) {
		case 1:
			formato = "Livro Físico";
			break;
		case 2:
			formato = "Livro Digital(E-book)";
			break;
		default:
			formato = "Formato desconhecido";
			break;
		}
		
		System.out.println("Formato: " + formato);
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Formato: " + formato);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Número de Páginas: " + this.numeropaginas);
		System.out.printf("Preço: R$ %.2f%n", this.preco);
		System.out.println("***************************"); 	
	}

	public void listarPorTitulos() {

		String formato = "";

		switch (this.formato) {
		case 1:
			formato = "Livro Fisico";
			break;
		case 2:
			formato = "Livro Digital";
			break;
		}

		System.out.println("ID do Livro: " + this.numero);
		System.out.println("Título: " + this.titulo);
		System.out.println("Formato: " + formato + "\n\n");
	}
}
