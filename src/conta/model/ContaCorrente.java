package conta.model;

import java.util.Scanner;

import conta.util.Cores;

public class ContaCorrente extends Conta {

	private float limite;
	
	
	public ContaCorrente(int numero, int agencia, int tipo, String nomeDoTitular, float saldo, float limite) {
		super(numero, agencia, tipo, nomeDoTitular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {
		
		if(valor > getSaldo() + getLimite()) {
			System.out.println("Seu saldo é insuficiente!");
			return false;
		}
		
		setSaldo(getSaldo() - valor);
		return true;
	}

	@Override
	public void vizualizarInformaçõesDaConta() {
		super.vizualizarInformaçõesDaConta(); 
		System.out.println("Limite: " + this.limite + "                      ");
		System.out.println("*************************************************" + Cores.TEXT_RESET);
	}
	
	

}
