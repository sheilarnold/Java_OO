package Main;

public class SeguroDeVida implements Seguros{
	private double valorSeguro; 
	
	public SeguroDeVida(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public double getValorSeguro() {
		return valorSeguro;
	}

	@Override
	public String toString() {
		return "Seguro de vida: \n	Valor: " + valorSeguro + "]";
	}

}
