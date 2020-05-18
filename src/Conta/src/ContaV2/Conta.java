package ContaV2;

public class Conta {
	private int numero;
	//String titular;
	Cliente titular;
	private double saldo;
	private double limite;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean saca(double valor) {
		if((this.saldo >= valor) && (valor >= 1) && (valor <= this.limite)) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deposita(double valor) {
		if(valor >= 1) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tranfere(Conta destino, double valor) {
		if((this.saldo >= valor) && (valor >= 1) && (valor <= this.limite)) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
}
