package repository;

import model.Livro;

public interface LivroRepository {
	public void cadastrarLivro(Livro livro);

	public void deletarLivro(int numero);

	public void listarLivros();

	public void gerarLivros(Livro livro);

	public void buscarLivro(int numero);
}