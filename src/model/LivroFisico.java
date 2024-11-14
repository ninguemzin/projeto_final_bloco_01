package model;

public class LivroFisico extends Livro {

	public LivroFisico(int numero, String titulo, String autor, int ano, int formato, String genero, int numeropaginas,
			float preco) {
		super(numero, titulo, autor, ano, formato, genero, numeropaginas, preco);
	}

	@Override
	public void visualizarLivro() {
		super.visualizarLivro();
	}
}