package conta;

import java.util.Scanner;

import conta.enumarate.Tipo;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {
	
	public static void exibirMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "*********************************************");
		System.out.println("        BEM VINDO AO MENU DO BANCO GEN       ");
		System.out.println("*********************************************");
		System.out.println("1 - ABRIR CONTA                              ");
		System.out.println("2 - LISTAR TODAS AS CONTAS                   ");
		System.out.println("3 - BUSCAR CONTA PELO NÚMERO                 ");
		System.out.println("4 - ATUALIZAR DADOS DA CONTA                 ");
		System.out.println("5 - PARA REALIZAR DEPÓSITO                   ");
		System.out.println("6 - PARA REALIZAR SAQUE                      ");
		System.out.println("7 - PARA TRANFERÊNCIA ENTRE CONTA            ");
		System.out.println("8 - PARA FECHAR A CONTA                      ");
		System.out.println("9 - PARA APAGAR A CONTA                      ");
		System.out.println("10 - PARA SAIR DO SISTEMA                    ");
		System.out.println("*********************************************");
		System.out.print("Digite a opção desejada:                    ");
		int op = sc.nextInt();
		System.out.println("*********************************************" + Cores.TEXT_RESET);
		
		sc.close();
		
	}

	public static void main(String[] args) {
		
	//Conta c1 = new Conta("123456", "01", "Daniela Xavier", Tipo.CONTA_CORRENTE, 1000.0f, true);

	//c1.vizualizarInformaçõesDaConta();
		
	exibirMenu();

	}
}
