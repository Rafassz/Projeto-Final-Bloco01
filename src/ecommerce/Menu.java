package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;
import ecomerce.util.Cores;

public class Menu {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

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
			System.out.println("            5 - Caixa                                           ");
			System.out.println("            6 - Teste ( Versão para Clientes)                   ");
			System.out.println("            7 - Sair                                            ");
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
			if(opcao == 7) {
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "                     Finalizando Programa...                    ");
				sobre();
				scanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "                         Cadastrar produto                      ");
				break;
			case 2:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "                         Atualizar Produto                      ");
				break; 
			case 3:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "                         Listar Produtos                        ");
				break;
			case 4:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "                         Apagar Produto                         ");
				break;
			case 5:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "                              Caixa                             ");
				break; 
			case 6:
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "                       Teste (Versão para Clientes)               \n\n");
				System.out.println("                        Iniciando...                            ");
				break; 
			case 7:
				System.out.println(Cores.TEXT_YELLOW + "Finalizando Execução...\n\n");

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
}
