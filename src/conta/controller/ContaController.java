package conta.controller;

import java.util.ArrayList;
import java.util.List;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository{
	
	private List<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			conta.vizualizarInformaçõesDaConta();
		} else {
			System.out.println("\nA conta número " + numero + " não foi encontrada!");
		}
	}

	@Override
	public void listarTodas() {
		for (var conta: listaContas) {
			conta.vizualizarInformaçõesDaConta();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta " + conta.getNumero() + " foi criada com sucesso!!");
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if(buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\nA Conta numero: " + conta.getNumero() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nA conta número: " + conta.getNumero() + " não foi encontrada!");
		}
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			if(listaContas.remove(conta) == true) {
            System.out.println("\nA conta " + numero + " foi deletada com sucesso!");
		}else {
			System.out.println("\nA conta " + numero + " não foi encontrada!");
		}
	}
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			if(conta.sacar(valor) == true) {
				System.out.println("\nO saque da conta " + numero + " no valor de " + valor +" foi efetuado com sucesso!");
			} else {
				System.out.println("\nA conta " + numero + " não foi encontrada!");
			}
		}
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			conta.depositar(valor);
			System.out.println("\nO deposito da conta " + numero + " no valor de " + valor +" foi efetuado com sucesso!");
		} else {
			System.out.println("\nA conta " + numero + " não foi encontrada ou a conta destino não é uma conta corrente!");
		}
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var cantaOrigem = buscarNaCollection(numeroOrigem);
		var cantaDestino = buscarNaCollection(numeroDestino);
		
		if(cantaOrigem != null && cantaDestino != null) {
			if(cantaOrigem.sacar(valor) == true) {
				cantaDestino.depositar(valor);
				System.out.println("\nA transferência foi efetuado com sucesso!!");
		} else {
			System.out.println("\nA conta de origem e/ou destino não foram encontradas!!");
		}
		}
	}
	
	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta: listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

}
