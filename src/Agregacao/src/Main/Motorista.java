package Main;

public class Motorista {
	private String nome;
	private int habilitacao;
	
	/*
	 * M�todo construtor passando como par�metro uma String (Motorista) e um int (habilita��o).
	 */
	public Motorista(String nome, int habilitacao) {
		this();
		this.nome = nome;
		this.habilitacao = habilitacao;
	}

	public Motorista() {
		super();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHabilitacao() {
		return this.habilitacao;
	}

	public void setHabilitacao(int habilitacao) {
		this.habilitacao = habilitacao;
	}

	/*
	 * M�todo toString() para impress�o em formato String do objeto Motorista.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motorista [nome=");
		builder.append(nome);
		builder.append(", habilitacao=");
		builder.append(habilitacao);
		builder.append("]");
		return builder.toString();
	}
}
