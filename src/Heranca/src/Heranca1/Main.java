package Heranca1;

public class Main {

	public static void main(String[] args) {
		Jogador jogador = new Jogador("Ferdinando", 12);
		
		jogador.seApresentar();
		jogador.getAindaJoga();
		
		jogador.setAindaJoga("Claro que sim. " + "E apesar de gordo ainda faço gol.");
		jogador.getAindaJoga();
		
		jogador.nome = "Ronaldinho";
		jogador.setIdade(45);
		
		jogador.seApresentar();
		jogador.setAindaJoga("Claro que não. " + "O coitado está preso.");
		jogador.getAindaJoga();

	}

}
