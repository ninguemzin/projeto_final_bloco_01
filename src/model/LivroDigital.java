package model;

public class LivroDigital extends Livro {

	public LivroDigital(int numero, String titulo, String autor, int ano, int formato, String genero, int numeropaginas,
			float preco) {
		super(numero, titulo, autor, ano, formato, genero, numeropaginas, preco);

	}

	@Override
	public void visualizarLivro() {
		super.visualizarLivro();
	}
}