package conta;

import conta.enumarate.Tipo;
import conta.model.Conta;

public class Menu {
	
	public void exibirMenu() {
		
		System.out.println("*********************************************");
		System.out.println("        BEM VINDO AO MENU DO BANCO GEN       ");
		System.out.println("*********************************************/n");
		System.out.println("1 - ABRIR CONTA");
		System.out.println();
		
	}

	public static void main(String[] args) {
		
	Conta c1 = new Conta("123456", "01", "Daniela Xavier", Tipo.CONTA_CORRENTE, 1000.0f, true);

	c1.vizualizarInformaçõesDaConta();

	}
}
