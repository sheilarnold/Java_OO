package Heranca1;

public class Jogador extends Pessoa {
	private String aindaJoga = "Não joga mais.";	
	
	public Jogador(String nome, int idade) {
		super(nome, idade);
	}	
	
	public void setAindaJoga(String aindaJoga) {
		this.aindaJoga = aindaJoga;
	}
	
	public void getAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
}
