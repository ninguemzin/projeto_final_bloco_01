package controller;

import java.util.ArrayList;

import model.Livro;
import repository.LivroRepository;

public class LivroController implements LivroRepository {

	private Carrinho carrinho = new Carrinho();

	private ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	int numero = 0;

	@Override
	public void cadastrarLivro(Livro livro) {
		livro.setNumero(gerarNumero());
		listaLivros.add(livro);
		System.out.println("Livro cadastrado com sucesso!");

	}

	@Override
	public void deletarLivro(int numero) {
		var livro = buscarNaCollection(numero);

		if (livro != null) {
			if (listaLivros.remove(livro) == true)
				System.out.println("\nO Livro " + livro.getTitulo() + " foi deletado.");
		} else
			System.out.println("\nO Livro numero: " + numero + " não foi encontrada!");

	}

	@Override
	public void listarLivros() {
		if (listaLivros.isEmpty()) {
			System.out.println("\nNenhum livro cadastrado.");
		} else {
			for (var livro : listaLivros) {
				livro.visualizarLivro();
			}
		}
	}

	public int gerarNumero() {
		return ++numero;
	}

	public void listarTitulos() {
		if (listaLivros.isEmpty()) {
			System.out.println("\nNenhum título cadastrado.");
		} else {
			for (var livro : listaLivros) {
				livro.listarPorTitulos();
			}
		}

	}

	@Override
	public void buscarLivro(int numero) {
		var livro = buscarNaCollection(numero);

		if (livro != null)
			livro.visualizarLivro();
		else
			System.out.println("\nA livro: " + " não foi encontrada!");

	}

	public Livro buscarNaCollection(int numero) {
		for (var livro : listaLivros) {
			if (livro.getNumero() == numero) {
				return livro;
			}
		}
		return null;
	}

	public void adicionarAoCarrinho(int numero) {
		Livro livro = buscarNaCollection(numero);
		if (livro != null) {
			carrinho.adicionarLivro(livro);
		} else {
			System.out.println("Livro com número " + numero + " não encontrado.");
		}
	}

	public void removerDoCarrinho(int numero) {
		carrinho.removeLivro(numero);
	}

	public void listarItensCarrinho() {
		carrinho.listarItensCarrinho();
	}

	public void finalizarCompra() {
		carrinho.finalizarCompra();
	}
}
