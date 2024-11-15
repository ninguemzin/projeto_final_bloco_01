package utils;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Carrinho;
import controller.LivroController;
import model.Livro;
import model.LivroDigital;
import model.LivroFisico;

public class Menu {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Carrinho carrinho = new Carrinho();

		LivroController livros = new LivroController();

		int opcao, numero, ano, formato, numeropaginas;
		String titulo, genero, autor;
		float preco;

		LivroFisico lv1 = new LivroFisico(1, "O Hobbit", "J.R.R. Tolkien", 1937, 1, "Aventura", 310, 59.90f);
		LivroFisico lv2 = new LivroFisico(2, "1984", "George Orwell", 1949, 1, "Distopia", 328, 49.90f);

		LivroDigital lv3 = new LivroDigital(3, "A Menina que Roubava Livros", "Markus Zusak", 2005, 2, "Drama", 560,
				29.90f);
		LivroDigital lv4 = new LivroDigital(4, "O Código Da Vinci", "Dan Brown", 2003, 2, "Suspense", 454, 19.90f);

		livros.cadastrarLivro(lv1);
		livros.cadastrarLivro(lv2);
		livros.cadastrarLivro(lv3);
		livros.cadastrarLivro(lv4);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  Estante Virtual                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Listar Livros                        ");
			System.out.println("            2 - Buscar Livro                         ");
			System.out.println("            3 - Deletar Livro                        ");
			System.out.println("            4 - Adicionar livro ao carrinho          ");
			System.out.println("            5 - remover livro do carrinho            ");
			System.out.println("            6 - Lista do carrinho                    ");
			System.out.println("            7 - Cadastrar Livro                      ");
			System.out.println("            7 - Finalizar Compra                     ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                                                        ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nEstante Virtual - Obrigado por visitar!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Listar Livros\n\n");
				livros.listarLivros();
				keyPress();
				break;
			case 2:
				System.out.println("Visualizar detalhes do Livro - por numero\n\n");
				livros.listarTitulos();
				System.out.println("Digite o numero do livro: ");
				numero = leia.nextInt();
				livros.buscarLivro(numero);
				keyPress();
				break;
			case 3:
				System.out.println("Deletar Livro\n\n");
				System.out.println("tirar Livro\n\n");

				System.out.println("Digite o número do livro: ");
				numero = leia.nextInt();

				livros.deletarLivro(numero);
				keyPress();
				break;
			case 4:
				System.out.println("Digite o numero do livro para adicionar ao carrinho:");
				livros.listarTitulos();
				int numeroLivroAdicionar = leia.nextInt();
				livros.adicionarAoCarrinho(numeroLivroAdicionar);

				keyPress();
				break;
			case 5:
				System.out.println("Escolha o numero do Livro que deseja remover:");
				livros.listarTitulos();
				int numeroLivroRemover = leia.nextInt();
				livros.removerDoCarrinho(numeroLivroRemover);
				keyPress();
				break;
			case 6:
				livros.listarItensCarrinho();
				keyPress();
				break;
			case 7:
				livros.finalizarCompra();
				keyPress();
				break;
			case 8:
				System.out.println("Cadastrar Livro!\n\n");

				System.out.println("Digite o Título do Livro: ");
				leia.skip("\\R?");
				titulo = leia.nextLine();

				System.out.println("Digite o Gênero do Livro: ");
				genero = leia.nextLine();
				leia.skip("\\R?");

				System.out.println("Digite o Ano de Publicação: ");
				ano = leia.nextInt();

				System.out.println("Digite o Formato do Livro (1 - Físico, 2 - Digital): ");
				formato = leia.nextInt();
				leia.skip("\\R?");

				System.out.println("Digite o Autor: ");
				autor = leia.nextLine();
				leia.skip("\\R?");

				System.out.println("Digite o numero de páginas: ");
				numeropaginas = leia.nextInt();
				leia.skip("\\R?");

				System.out.println("Digite o preço do Livro: ");
				preco = leia.nextFloat();
				System.out.println("Título: " + titulo);
				System.out.println("Gênero: " + genero);
				System.out.println("Ano de Publicação: " + ano);
				System.out.println("Formato: " + (formato == 1 ? "Físico" : "Digital"));
				System.out.println("Autor Livro: " + autor);
				System.out.println("Numero de Páginas do Livro: " + numeropaginas);
				System.out.println("Preço Livro: " + preco);
				if (formato == 1) {
					System.out.println("\nPedido de Livro criado com sucesso!");
					livros.cadastrarLivro(new LivroFisico(livros.gerarNumero(), titulo, genero, ano, formato, autor,
							numeropaginas, preco));
				} else if (formato == 2) {
					System.out.println("\nPedido de Livro criado com sucesso!");
					livros.cadastrarLivro(new LivroDigital(livros.gerarNumero(), titulo, genero, ano, formato, autor,
							numeropaginas, preco));
				} else {
					System.out.println("Numero inválido!!");
				}
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Emerson Marques");
		System.out.println("Desenvolvedora Marques - marquesintel147@gmail.com");
		System.out.println("https://github.com/ninguemzin");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
