package model;

public abstract class Livro {

	private int id;
	private String titulo;
	private String editora;
	private String autor;
	private int ano;
	private int formato;
	private String genero;
	private String descricao;
	private int numeropaginas;

	public Livro(int id, String titulo, String editora, String autor, int ano, int formato, String genero,
			String descricao, int numeropaginas) {
		this.id = id;
		this.titulo = titulo;
		this.editora = editora;
		this.autor = autor;
		this.ano = ano;
		this.formato = formato;
		this.genero = genero;
		this.descricao = descricao;
		this.numeropaginas = numeropaginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumeropaginas() {
		return numeropaginas;
	}

	public void setNumeropaginas(int numeropaginas) {
		this.numeropaginas = numeropaginas;
	}

	public void visualizarLivro() {

		String formato = "";

		switch (this.formato) {
		case 1:
			formato = "Livro Fisico";
			break;
		case 2:
			formato = "Livro Digital";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Livro:");
		System.out.println("***********************************************************");
		System.out.println("ID do Livro: " + this.id);
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Editora: " + this.editora);
		System.out.println("Ano de Publicação: " + this.ano);
		System.out.println("Formato: " + formato);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Número de Páginas: " + this.numeropaginas);
		System.out.println("***********************************************************");

	}
}
