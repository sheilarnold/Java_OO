package Main;

public class Motor {
	private int potencia;
	
	public Motor(int potencia) {
		this();
		this.potencia = potencia;
	}

	public Motor() {
		super();
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/*
	 * Método toString() para impressão em formato String do objeto Motor
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	}
}
