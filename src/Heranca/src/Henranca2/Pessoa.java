package Henranca2;

//Super classe
public class Pessoa {

	String nome;
	protected int idade; //Protected d� visibilidade apenas at� suas subclasses
	
	public void seApresentar() {
		System.out.println("Ol�, eu sou o " + nome + ", e tenho " + idade + " anos.");
	}
	
}
