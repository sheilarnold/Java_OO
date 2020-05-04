package OO_basico;

public class Conta {
	String titular, agencia;
	int numero;
	double saldo;
	Data dataAbertura;
	
	void saca(double valor) {
		this.saldo -= valor;
	}
	
	boolean deposita(double valor) {
		if(valor >= 1) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	double calculaRendimento() {
		return 120;
	}
	
	void showInfo() {
		System.out.println("Titular: " + this.titular + "\nNúmero: " + this.numero + "\nAgência: " + this.agencia + "\nData de abertura: " + dataAbertura.dia + "/"+ dataAbertura.mes + "/" + dataAbertura.ano + "\nSaldo: " + this.saldo + "\nRendimento mensal de R$: " + this.calculaRendimento());
	}
}
