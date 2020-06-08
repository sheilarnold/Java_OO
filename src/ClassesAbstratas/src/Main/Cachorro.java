package Main;

public class Cachorro extends Animal{
	public String raca;	
	public static String nome;
	public final String teste = "teste";
	public static final String teste2 = "teste2";	
	
	public String getTeste() {
		return teste;
	}

	public static String getTeste2() {
		return teste2;
	}
	
	public static void getNome() {
		System.out.println(nome);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void som() {
		System.out.println("Latido");		
	}

	@Override
	public void imprimirDados() {
		System.out.println("Animal do g�nero: " + super.getEspecie() + "\nDa ra�a: " + raca);		
	}
}
