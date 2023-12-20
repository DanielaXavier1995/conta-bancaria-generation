package conta.model;

import java.util.Scanner;

import conta.util.Cores;

public class ContaPoupanca extends Conta {

	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String nomeDoTitular, float saldo, int aniversario) {
		super(numero, agencia, tipo, nomeDoTitular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void vizualizarInformaçõesDaConta() {
		super.vizualizarInformaçõesDaConta();
		System.out.println("Aniversário: " + this.aniversario + "           ");
		System.out.println("*************************************************" + Cores.TEXT_RESET);
	}
	
}
