package conta;

import java.util.Scanner;

import conta.enumarate.Tipo;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {
	
	public static int exibirMenu(Scanner sc) {
		
		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "*********************************************\n");
		System.out.println("        BEM VINDO AO MENU DO BANCO GEN       ");
		System.out.println("\n*********************************************\n");
		System.out.println("1 - ABRIR CONTA                              ");
		System.out.println("2 - LISTAR TODAS AS CONTAS                   ");
		System.out.println("3 - BUSCAR CONTA PELO NÚMERO                 ");
		System.out.println("4 - ATUALIZAR DADOS DA CONTA                 ");
		System.out.println("5 - PARA REALIZAR DEPÓSITO                   ");
		System.out.println("6 - PARA REALIZAR SAQUE                      ");
		System.out.println("7 - PARA TRANFERÊNCIA ENTRE CONTA            ");
		System.out.println("8 - PARA FECHAR A CONTA                      ");
		System.out.println("9 - PARA APAGAR A CONTA                      ");
		System.out.println("0 - PARA SAIR DO SISTEMA                    ");
		System.out.println("\n*********************************************");
		System.out.print("Digite a opção desejada:                    ");
		int op = sc.nextInt();
		System.out.println("*********************************************" + Cores.TEXT_RESET);
		
		return op;
		
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	Conta conta = new Conta();

	int opcao;
	
	do {

	opcao = exibirMenu(sc);
	
	switch(opcao) {
	
	case 1:
		System.out.println("*********************************************\n");
		System.out.println("      ** BANCO GEN - SEJA SEU FUTURO!! **      ");
		System.out.println("\n*********************************************");
		System.out.print("Digite o número de conto (com 6 digitos): ");
		conta.setNumero(sc.nextLine());
		System.out.println("\n*********************************************");
		System.out.print("Digite a agência (com 2 dígitos): ");
		conta.setAgencia(sc.nextLine());
		System.out.println("\n*********************************************");
		System.out.print("Digite o nome do titular: ");
		conta.setNomeDoTiular(sc.nextLine());
		System.out.println("\n*********************************************");
		System.out.println("Digite o saldo da conta: ");
		conta.setSaldo(sc.nextFloat());
		System.out.println("\n*********************************************");
		System.out.println("                 TIPO DA CONTA                 ");
		System.out.println("\n*********************************************");
		System.out.println("               1 - Conta Corrente              ");
		System.out.println("               2 - Conta Poupança              ");
		System.out.println("               3 - Conta Salário               ");
		System.out.println("               4 - Conta Universitária         ");
		System.out.println("Digite o tipo da conta: ");
		
		
		//Como pegar o tipoooo???
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		break;
	case 6:
		break;
	case 7:
		break;
	case 8:
		break;
	case 9:
		break;
	default:
		System.out.println("*********************************************");
		System.out.println("      Opção Inválida, escolha novamente!     ");
		System.out.println("*********************************************");
		break;
    }
		
	} while(opcao != 0);
		
    sc.close();
	}
}
