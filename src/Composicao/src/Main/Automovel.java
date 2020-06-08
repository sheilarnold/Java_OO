package Main;

public class Automovel {
	private String modelo;
	private Motor motor;

	public Automovel(String modelo, int potenciaMotor) {
		this();
		this.modelo = modelo;
		this.motor = new Motor(potenciaMotor);
	}

	public Automovel() {
		super();
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return this.motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Automovel [modelo=");
		builder.append(modelo);
		builder.append(", motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
}
