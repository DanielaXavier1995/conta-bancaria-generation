package conta.model;

import java.util.Scanner;

import conta.util.Cores;

public abstract class Conta {
	
	private int numero;
	private int agencia;
	private int tipo;
	private String nomeDoTitular;
	private float saldo;

	
	public Conta() {
		
	}
	

	public Conta(int numero, int agencia, int tipo, String nomeDoTitular, float saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}



	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getNomeDoTiular() {
		return nomeDoTitular;
	}


	public void setNomeDoTiular(String nomeDoTiular) {
		this.nomeDoTitular = nomeDoTiular;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
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
	
	public void vizualizarInformaçõesDaConta() {
		
		System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND + "*************************************************");
		System.out.println("               INFORMAÇÕES DA CONTA              ");
		System.out.println("*************************************************");
		System.out.println("Número: " + this.numero + "                      ");
		System.out.println("*************************************************");
		System.out.println("Agencia: " + this.agencia + "                    ");
		System.out.println("*************************************************");
		System.out.println("Nome do Titular: " + this.nomeDoTitular + "       ");
		System.out.println("*************************************************");
		System.out.println("Tipo: " + tipo + "                               ");
		System.out.println("*************************************************");
		System.out.println("Saldo: " + this.saldo + "                       ");
		System.out.println("*************************************************");
	}
	
}
