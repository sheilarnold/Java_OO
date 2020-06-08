package Main;

public class Automovel {
	private String modelo;
	private Motor motor;
	private Motorista motorista;

	/*
	 * M�todo construtor sobrecarregado que adiciona o par�metro do tipo Motorista
	 * neste caso o motorista n�o ser� inst�nciado dentro do construtor da classe Automovel, e sim adicionado
	 * a lista de par�metros deste construtor, pois caso o objeto Automovel seja destru�do o objeto Motorista continuar� existindo.
	 */
	public Automovel(String modelo, int potenciaMotor, Motorista motorista) {
		this(modelo, potenciaMotor);
		this.motorista = motorista;
	}

	/*
	 * M�todo construtor passando como par�metro uma String que indicar� o modelo do Automovel e 
	 * um int que indicar� a pot�ncia do Motor, inst�nciado dentro do deste m�todo construtor.
	 */
	public Automovel(String modelo, int potenciaMotor) {
		this();
		this.modelo = modelo;
		/*
		 * Um objeto do tipo Motor sendo inst�nciado dentro do m�todo construtor da classe Automovel,
		 * sendo assim, ser� gerada uma associ��o do tipo composi��o, pois o objeto Motor existir� somente enquanto o objeto
		 * Automovel existir.
		 */
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

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	/*
	 * M�todo toString() para impress�o em formato String do objeto Automovel.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Automovel [modelo=");
		builder.append(modelo);
		builder.append(", motor=");
		builder.append(motor);
		builder.append(", motorista=");
		builder.append(motorista);
		builder.append("]");
		return builder.toString();
	}

}
