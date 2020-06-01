package Main;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;	
	
	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getProfissao() {
		return profissao;
	}
	
	@Override
	public String toString() {
		return String.format("Cliente:\n Nome: %s\n CPF: %s\n Profissao: %s", nome, cpf, profissao);
	}
}
