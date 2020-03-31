package Main;

public class Conta {
	private double saldo;
	private String numConta, titular;
	
	public Conta(double saldo, String numConta, String titular) {
		this.saldo = saldo;
		this.numConta = numConta;
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void imprimirDados() {
		System.out.println("Titular: " + getTitular() + "\nConta: " + getNumConta() + "\nSaldo: " + getSaldo());
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	
}
