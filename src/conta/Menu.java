package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
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
		System.out.println("8 - PARA APAGAR A CONTA                      ");
		System.out.println("0 - PARA SAIR DO SISTEMA                    ");
		System.out.println("\n*********************************************");
		System.out.print("Digite a opção desejada:                    ");
		int op = sc.nextInt();
		System.out.println("*********************************************" + Cores.TEXT_RESET);
		
		return op;
		
	}
	
	public static void escolherOpcao() {
		
		Scanner sc = new Scanner(System.in);

		int opcao;
		
		do {

		opcao = exibirMenu(sc);
		
		switch(opcao) {
		
		case 1:
			System.out.println("\n Criar Conta");
			break;
		case 2:
			System.out.println("\n Listar todas as Contas");
			break;
		case 3:
			System.out.println("\n Buscar Conta por número");
			break;
		case 4:
			System.out.println("\n Atualizar dados da Conta");
			break;
		case 5:
			System.out.println("\n Depositar");
			break;
		case 6:
			System.out.println("\n Sacar");
			break;
		case 7:
			System.out.println("\n Transferir");
			break;
		case 8:
			System.out.println("\n Apagar Conta");
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

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		ContaCorrente cc = new ContaCorrente("123456", "01", "Dani", 1, 1000.0f , 5000.0f);
//		cc.vizualizarInformaçõesDaConta(sc);
//		cc.sacar(500.0f);
//		cc.vizualizarInformaçõesDaConta(sc);
//		cc.depositar(1000.f);
//		cc.vizualizarInformaçõesDaConta(sc);
		
		ContaPoupanca cp = new ContaPoupanca("123456", "01", "Dani", 1, 1000.0f , 21);
		cp.vizualizarInformaçõesDaConta(sc);
		cp.sacar(500.0f);
		cp.vizualizarInformaçõesDaConta(sc);
		cp.depositar(1000.f);
		cp.vizualizarInformaçõesDaConta(sc);
		
	    sc.close();
	}
}
