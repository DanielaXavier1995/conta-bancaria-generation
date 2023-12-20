package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void cadastrar(ContaController contas) {
		
		int tipo;
		
		System.out.print("Digite o número da Agência: ");
		int agencia = leia.nextInt();
		System.out.print("Digite o nome do Titular: ");
		leia.skip("\\R?");
		String nomeTitular = leia.nextLine();
		
		do {
		System.out.print("Digite o tipo da conta (1 - CC ou 2 - CP): ");
		tipo = leia.nextInt();
		} while(tipo < 1 && tipo > 2);
		
		System.out.print("Digite o saldo da Conta: ");
		float saldo = leia.nextFloat();
		
		switch(tipo) {
		case 1:
			System.out.print("Digite o limite de crédito (R$): ");
			float limite = leia.nextFloat();
			contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo,
					nomeTitular, saldo, limite));
			break;
		case 2:
			System.out.print("Digite o dia do aniversário da conta: ");
			int aniversario = leia.nextInt();
			contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo,
					nomeTitular, saldo, aniversario));
			break;
		default: 
			System.out.println("Tipo da conta inválido!");
	}
	}
	
     public static void atualizar(ContaController contas, int numero) {
		
		int tipo;
		
		System.out.print("Digite o número da Agência: ");
		int agencia = leia.nextInt();
		System.out.print("Digite o nome do Titular: ");
		leia.skip("\\R?");
		String nomeTitular = leia.nextLine();
		
		do {
		System.out.print("Digite o tipo da conta (1 - CC ou 2 - CP): ");
		tipo = leia.nextInt();
		} while(tipo < 1 && tipo > 2);
		
		System.out.print("Digite o saldo da Conta: ");
		float saldo = leia.nextFloat();
		
		switch(tipo) {
		case 1:
			System.out.print("Digite o limite de crédito (R$): ");
			float limite = leia.nextFloat();
			contas.atualizar(new ContaCorrente(numero, agencia, tipo,
					nomeTitular, saldo, limite));
			break;
		case 2:
			System.out.print("Digite o dia do aniversário da conta: ");
			int aniversario = leia.nextInt();
			contas.atualizar(new ContaPoupanca(numero, agencia, tipo,
					nomeTitular, saldo, aniversario));
			break;
		default: 
			System.out.println("Tipo da conta inválido!");
	}
	}

	public static void main(String[] args) {
		
		ContaController contas = new ContaController();

		int opcao = 0;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     BANCO GEN                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada:                          " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco Gen - O seu futuro começa aqui!");
				sobre();
                leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n       Criar Conta     \n");
                cadastrar(contas);
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n   Listar todas as Contas  \n");
                contas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n Buscar Conta por número \n");
				System.out.print("Digite o número da conta: ");
				int numero = leia.nextInt();
				contas.procurarPorNumero(numero);
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n Atualizar dados da Conta \n");
				System.out.print("Digite o número da conta: ");
				int num = leia.nextInt();
				
				var buscarConta = contas.buscarNaCollection(num);
				
				if(buscarConta != null) {
					atualizar(contas, num);
				} else {
					System.out.println("Conta não encontrada!!");
				}
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n       Apagar Conta      \n");
				System.out.print("Digite o número da conta: ");
				int n = leia.nextInt();
				contas.deletar(n);
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n        Sacar        \n");
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n      Depositar      \n");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n    Transferir     \n");

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_WHITE_BACKGROUND + "\nOpção Inválida" + Cores.TEXT_RESET);
				
				keyPress();
				break;
			}
		}
	}

    	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Daniela Xavier");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
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
