package Construtor2;

public class Conta {
	private double saldo;
	private String numConta;	
	
	public Conta(double saldo, String numConta) {
		this.saldo = saldo;
		this.numConta = numConta;
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numConta=" + numConta + "]";
	}
}
