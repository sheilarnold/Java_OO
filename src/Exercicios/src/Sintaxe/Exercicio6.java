package Sintaxe;

public class Exercicio6 {
	public static void main(String[] args) {
		double fibo = 0;
		double aux = 1;
		for (int i = 0; i < 100; i++) {
			System.out.println((i + 1) + "º elemento: " + (int) fibo);
			double sum = fibo + aux;
			fibo = aux;
			aux = sum;
		}
	}
}
