package Main;

public class Main {
	public static void main(String[] args) {
		Motorista motorista = new Motorista("Fernando", 1234567);
		Automovel gol = new Automovel("Gol 1.0", 1000, motorista);
		System.out.println(gol.toString());
	}
}
