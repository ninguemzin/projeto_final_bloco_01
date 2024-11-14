package utils;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;
import controller.LivroController;
import model.Livro;
import model.LivroDigital;
import model.LivroFisico;

public class Menu {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		LivroController livros = new LivroController();

		int opcao,numero, ano, formato, numeropaginas;
		String titulo, genero, autor;
		float preco;
		
		LivroFisico lv1 = new LivroFisico(1, "O Hobbit", "J.R.R. Tolkien", 1937, 1, "Aventura", 310, 59.90f);
        LivroFisico lv2 = new LivroFisico(2, "1984", "George Orwell", 1949, 1, "Distopia", 328, 49.90f);

        LivroDigital lv3 = new LivroDigital(3, "A Menina que Roubava Livros", "Markus Zusak", 2005, 2, "Drama", 560, 29.90f);
        LivroDigital lv4 = new LivroDigital(4, "O Código Da Vinci", "Dan Brown", 2003, 2, "Suspense", 454, 19.90f);

		
        livros.gerarLivros(lv1);
        livros.gerarLivros(lv2);
        livros.gerarLivros(lv3);
        livros.gerarLivros(lv4);
        
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
			System.out.println("            4 - Finalizar Compra                     ");
			System.out.println("            5 - Listar Pedidos                       ");
			System.out.println("            6 - Fazer Pedido                         ");
			System.out.println("            7 - Sair                                 ");
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

			if (opcao == 7) {
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
				keyPress();
				
				System.out.println("Digite o numero da conta: ");
				numero = leia.nextInt();

				livros.buscarLivro(numero);
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
				System.out.println("Finalizar Compra\n\n");
				keyPress();
				break;
			case 5:
				System.out.println("Listar Pedidos\n\n");
				keyPress();
				break;
			case 6:
				System.out.println("Fazer Pedido\n\n");

				System.out.print("Digite o Título do Livro: ");
				leia.skip("\\R?");
				titulo = leia.nextLine();

				System.out.print("Digite o Gênero do Livro: ");
				genero = leia.nextLine();

				System.out.print("Digite o Ano de Publicação: ");
				ano = leia.nextInt();

				System.out.print("Digite o Formato do Livro (1 - Físico, 2 - Digital): ");
				formato = leia.nextInt();
				
				System.out.print("Digite o preço do Livro: ");
				autor = leia.nextLine();
				
				System.out.print("Digite o preço do Livro: ");
				numeropaginas = leia.nextInt();
				
				System.out.print("Digite o preço do Livro: ");
				preco = leia.nextFloat();

				System.out.println("\nPedido de Livro criado com sucesso!");
				System.out.println("Título: " + titulo);
				System.out.println("Gênero: " + genero);
				System.out.println("Ano de Publicação: " + ano);
				System.out.println("Formato: " + (formato == 1 ? "Físico" : "Digital"));
				System.out.println("Autor Livro: " + autor);
				System.out.println("Numero de Páginas do Livro: " + numeropaginas);
				System.out.println("Preço Livro: " + preco);
				System.out.println("Pedido Realizado com Sucesso!");
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
