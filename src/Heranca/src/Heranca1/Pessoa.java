package Heranca1;

public class Pessoa {
	public String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void seApresentar() {
		System.out.println("Olá, eu sou o " + nome + 
				" e tenho " + idade + " anos.");
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
