package utils;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  Estante Virtual                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Listar Livros                        ");
			System.out.println("            2 - Buscar Livro                         ");
			System.out.println("            3 - Adicionar Livro ao Carrinho          ");
			System.out.println("            4 - Visualizar Carrinho                  ");
			System.out.println("            5 - Finalizar Compra                     ");
			System.out.println("            6 - Listar Pedidos                       ");
			System.out.println("            7 - Visualizar Detalhes do Pedido        ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                                                        ");

			opcao = leia.nextInt();

			if (opcao == 8) {
				System.out.println("\nEstante Virtual - Obrigado por visitar!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Listar Livros\n\n");
				break;
			case 2:
				System.out.println("Buscar Livro por Título\n\n");
				break;
			case 3:
				System.out.println("Adicionar Livro ao Carrinho\n\n");
				break;
			case 4:
				System.out.println("Visualizar Carrinho\n\n");
				break;
			case 5:
				System.out.println("Finalizar Compra\n\n");
				break;
			case 6:
				System.out.println("Listar Pedidos\n\n");
				break;
			case 7:
				System.out.println("Visualizar Detalhes do Pedido\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
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
}
