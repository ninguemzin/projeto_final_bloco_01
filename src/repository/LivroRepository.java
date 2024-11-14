package repository;

import model.Livro;

public interface LivroRepository {
	void adicionarLivro(Livro livro);

	void listarLivros();

	Livro buscarLivro(int id);
}