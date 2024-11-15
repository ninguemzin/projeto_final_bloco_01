package controller;

import java.util.ArrayList;

import model.Livro;

public class Carrinho {

	private ArrayList<Livro> itensCarrinho = new ArrayList<>();
	
	public void adicionarLivro(Livro livro) {
		itensCarrinho.add(livro);
		System.out.println("Livro adicionado no carrinho: " + livro.getTitulo());
	
	}
	
	public void removeLivro(int numero) {
		Livro livroParaRemover = null;
		
		for (Livro livro : itensCarrinho) {
			if (livro.getNumero() == numero) {
				livroParaRemover = livro;
				break;
			}
		}
	
	if(livroParaRemover != null) {
		itensCarrinho.remove(livroParaRemover);
		System.out.println("Livre removido do carrinho: " + livroParaRemover.getTitulo());
	}
	}
	
	public void listarItensCarrinho() {
		if (itensCarrinho.isEmpty()) {
			System.out.println("O carrinho está vazio.");
		} else {
			System.out.println("Itens no carrinho: ");
			for (Livro livro : itensCarrinho) {
				livro.visualizarLivro();
			}
		}
	}
	
	public float calcularTotal() {
		float total = 0; 
		for (Livro livro : itensCarrinho) {
			total += livro.getPreco();
		}
		return total;
	}
	
	public void finalizarCompra() {
		if (itensCarrinho.isEmpty()) {
			System.out.println("O carrinho está vazio. Adicionar itens antes de finalizar a compra.");
		} else {
			System.out.println("Total da compra: R$ " + calcularTotal());
			System.out.println("Compra finalizada com sucesso!");
			itensCarrinho.clear();
		}
	}
	
}
