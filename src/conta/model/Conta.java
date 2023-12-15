package conta.model;

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
	
	public void vizualizarInformaçõesDaConta() {
		System.out.println("*************************************************");
		System.out.println("               INFORMAÇÕES DA CONTA              ");
		System.out.println("*************************************************");
		System.out.println("Número: " + this.numero);
		System.out.println("*************************************************");
		System.out.println("Agencia: " + this.agencia);
		System.out.println("*************************************************");
		System.out.println("Nome do Titular: " + this.nomeDoTiular);
		System.out.println("*************************************************");
		System.out.println("Tipo: " + this.tipo);
		System.out.println("*************************************************");
		System.out.println("Status: " + this.status);
		System.out.println("*************************************************");
		System.out.println("Status: " + this.saldo);
		System.out.println("*************************************************");
	}
}
