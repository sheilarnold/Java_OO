package Main;

public class Main {
	public static void main(String[] args) {
		Cachorro.nome = "Lula";
		Cachorro.getNome();
		System.out.println(Cachorro.teste2);
		Cachorro.getTeste2();
		
		Cachorro c = new Cachorro();
		System.out.println(c.teste);
		c.getTeste();
	}
}
