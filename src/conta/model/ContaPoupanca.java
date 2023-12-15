package conta.model;

import java.util.Scanner;

public class ContaPoupanca extends Conta {

	private int aniversario;

	public ContaPoupanca(String numero, String agencia, String nomeDoTiular, int tipo, float saldo, int aniversario) {
		super(numero, agencia, nomeDoTiular, tipo, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void vizualizarInformaçõesDaConta(Scanner sc) {
		super.vizualizarInformaçõesDaConta(sc);
		System.out.println("Aniversário: " + this.aniversario);
		System.out.println("*************************************************");
	}
	
	

}
