package conta.model;

import java.util.Scanner;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(String numero, String agencia, String nomeDoTiular, int tipo, float saldo, float limite) {
		super(numero, agencia, nomeDoTiular,tipo, saldo);
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
	public void vizualizarInformaçõesDaConta(Scanner sc) {
		super.vizualizarInformaçõesDaConta(sc); 
		System.out.println("Limite: " + this.limite);
		System.out.println("*************************************************");
	}
	
	

}
