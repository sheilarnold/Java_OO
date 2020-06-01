package Main;

public class CreditoImobiliario extends Credito implements Emprestimos{

	public CreditoImobiliario(Conta conta, double valorCredito, double jurosMes, int numMeses) {
		super(conta, valorCredito, jurosMes, numMeses);
	}

	@Override
	public void calcularJuros() {}	

	@Override
	public String toString() {
		return "Credito Imobiliario\n	Valor: " + valorCredito + "\n	Juros Mensais" + jurosMes + "\n	Quantidade de parcelas: " + numMeses
				+ "]\n";
	}

}
