package Henranca2;

public class Jogador extends Pessoa {

	protected String aindaJoga = "N�o. N�o joga mais.";

	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}

}	
