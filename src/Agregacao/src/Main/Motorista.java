package Main;

public class Motorista {
	private String nome;
	private int habilitacao;
	
	/*
	 * Método construtor passando como parâmetro uma String (Motorista) e um int (habilitação).
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
	 * Método toString() para impressão em formato String do objeto Motorista.
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
