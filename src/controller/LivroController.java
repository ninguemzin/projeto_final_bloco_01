package controller;

import java.util.ArrayList;

import model.Livro;
import repository.LivroRepository;

public class LivroController implements LivroRepository {
	
	private ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	int numero = 0;

	@Override
	public void cadastrarLivro(Livro livro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarLivro(int numero) {
			var livro = buscarNaCollection(numero);

			if (livro != null) {
				if (listaLivros.remove(livro) == true)
					System.out.println("\nA Conta numero: " + numero + " foi deletada com sucesso!");
			} else
				System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
		
	}

	@Override
	public void listarLivros() {
		for (var livro : listaLivros) {
			livro.visualizarLivro();
		}
		
	}
	
	public void listarTitulos() {
		for (var livro : listaLivros) {
			livro.listarPorTitulos();
		}
		
	}

	@Override
	public void gerarLivros(Livro livro) {
		listaLivros.add(livro);
		
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

}
