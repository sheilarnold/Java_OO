package Main;

public class Tartaruga extends Animal {
	public String tipoCaso;

	public void som() {
		System.out.println("Nada");
	}
	
	@Override
	public void imprimirDados() {
		System.out.println("Animal do g�nero: " + super.getEspecie() + "\nTipo de casco: " + tipoCaso);
	}
	
}