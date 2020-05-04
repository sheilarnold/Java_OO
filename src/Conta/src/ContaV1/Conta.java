package ContaV1;

public class Conta {
	int numero;
	//String titular;
	Cliente titular;
	double saldo;
	double limite;
	
	boolean saca(double valor) {
		if((this.saldo >= valor) && (valor >= 1) && (valor <= this.limite)) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	boolean deposita(double valor) {
		if(valor >= 1) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	boolean tranfere(Conta destino, double valor) {
		if((this.saldo >= valor) && (valor >= 1) && (valor <= this.limite)) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
}
