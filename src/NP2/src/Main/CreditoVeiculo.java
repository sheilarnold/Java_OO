package Main;

public class CreditoVeiculo extends Credito implements Emprestimos {
	
	public CreditoVeiculo(Conta conta, double valorCredito, double jurosMes, int numMeses) {
		super(conta, valorCredito, jurosMes, numMeses);
	}

	@Override
	public void calcularJuros() {
		//Implementar código de juros, varia conformes a taxa
	}

	@Override
	public String toString() {
		return "Crédito Veicular:\n	Valor: " + valorCredito + "\n	Juros: " + jurosMes + "\n	Meses:" + numMeses
				+ "\n";
	}

}
