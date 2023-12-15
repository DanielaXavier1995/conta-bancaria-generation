package conta.model;

import java.util.Scanner;

import conta.util.Cores;

public class Conta {
	
	private String numero;
	private String agencia;
	private String nomeDoTiular;
	private int tipo;
	private float saldo;
	private boolean status;
	
	public Conta() {
		
	}
	
	public Conta(String numero, String agencia, String nomeDoTiular, int tipo, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeDoTiular = nomeDoTiular;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeDoTiular() {
		return nomeDoTiular;
	}

	public void setNomeDoTiular(String nomeDoTiular) {
		this.nomeDoTiular = nomeDoTiular;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = false;
	}
	
	public boolean sacar(float valor) {
		
		if(valor > getSaldo()) {
			System.out.println("Seu saldo é insuficiente!");
			return false;
		}
		
		setSaldo(getSaldo() - valor);
		return true;
	}
	
	public void depositar(float valor) {
		setSaldo(getSaldo() + valor);
	}
	
	public void vizualizarInformaçõesDaConta(Scanner sc) {
		
//		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "\n*************************************************");
//		System.out.println("               INFORMAÇÕES DA CONTA              ");
//		System.out.println("*************************************************");
//		System.out.println("1 - CONTA CORRENTE                               ");
//		System.out.println("2 - CONTA POUPANÇA                               ");
//		System.out.print("Digite o tipo da conta que deseja vizualizar:      " + Cores.TEXT_RESET);
//		this.tipo = sc.nextInt();
//		
//		String tipo = null;
		
//		switch(this.tipo) {
//			case 1:
//				tipo = "Conta Corrente";
//				break;
//			case 2:
//				tipo = "Conta Poupança";
//				break;
//			default:
//				System.out.println("Opção Inválida!");
//				break;
//		}
		
		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "*************************************************");
		System.out.println("               INFORMAÇÕES DA CONTA              ");
		System.out.println("*************************************************");
		System.out.println("Número: " + this.numero                           );
		System.out.println("*************************************************");
		System.out.println("Agencia: " + this.agencia                         );
		System.out.println("*************************************************");
		System.out.println("Nome do Titular: " + this.nomeDoTiular            );
		System.out.println("*************************************************");
		System.out.println("Tipo: " + tipo                                    );
		System.out.println("*************************************************");
		System.out.println("Status: " + this.status                           );
		System.out.println("*************************************************");
		System.out.println("Status: " + this.saldo                            );
		System.out.println("*************************************************" + Cores.TEXT_RESET);
	}
	
}
