package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import ecommerce.model.Estoque;
import java.util.Scanner;
import ecomerce.util.Cores;
import ecommerce.controller.EcommerceController;

public class Menu {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		EcommerceController produto = new EcommerceController();

		int opcao, tipo, lista, quantidade,numero;
		String produtos = null;

		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "****************************************************************");
			System.out.println("                                                                ");
			System.out.println("                       MERCADINHO DO GORDO                      ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("                                                                ");
			System.out.println("            1 - Cadastrar Produto                               ");
			System.out.println("            2 - Atualizar Produto                               ");
			System.out.println("            3 - Listar Produtos                                 ");
			System.out.println("            4 - Apagar Produto                                  ");
			System.out.println("            5 - Sair                                            ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("Entre com a opção desejada:                                     ");
			System.out.println("                                                                " + Cores.TEXT_RESET);

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite Valores Inteiros!!");
				scanner.nextLine();
				opcao = 0;
			}
			if (opcao == 5) {
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "                     Finalizando Programa...                    ");
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "                     Cadastrar produto                          ");

				System.out.println("Digite o Nome do Produto:                                       ");
				scanner.skip("\\R?");
				produtos = scanner.nextLine();
				
				System.out.println("Digite a Quantidade: ");
				quantidade = scanner.nextInt();
				
				produto.Cadastrar(new Estoque(produto.gerarNumero(), produtos, quantidade));
				System.out.println("O produto  Foi Cadastrado com Sucesso!!                        ");
				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "                         Atualizar Produto                      ");
				System.out.println("Digite o Número do Produto: ");
				numero = scanner.nextInt();
				
				var ID =produto.buscarNaCollection(numero);
					
					if(ID != null) {
						System.out.println("Digite o Nome do Produto:                                       ");
						scanner.skip("\\R?");
						
						System.out.println("Digite a Quantidade: ");
						quantidade = scanner.nextInt();
						produto.Cadastrar(new Estoque(produto.gerarNumero(),produtos, quantidade));
					}else {
						System.out.println("O Produto não foi encontrado!!");
					}
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "                         Listar Produtos                        ");
				produto.listarTodas();
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "                         Deletar Produto                        ");
				System.out.println("Digite o Número do Produto: ");
				numero = scanner.nextInt();
				
				produto.Deletar(numero);
				System.out.println("O Produto foi Deletado com Sucesso!! ");
				
				keyPress();
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}

		}

	}

	public static void sobre() {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
		System.out.println("\n                                                                ");
		System.out.println("****************************************************************");
		System.out.println("Projeto Desenvolvido por: Rafael Aparecido Gonçalves de Macedo  ");
		System.out.println("Rafael Aparecido - rafassz.aps@gmail.com                        ");
		System.out.println("https://github.com/Rafassz                                      ");
		System.out.println("****************************************************************");
		System.out.println("                                                                " + Cores.TEXT_RESET);

	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
