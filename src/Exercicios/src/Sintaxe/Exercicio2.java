package Sintaxe;

public class Exercicio2 {
	public static void main(String[] args) {
		int soma = 1;
		for (int i = 1; i <= 1000; i++) {
			soma += i;
			System.out.println((soma-i) + " + " + i + " = " + soma);
		}
		System.out.println("A soma dos n�meros de 1 at� 1000 � de: " + soma);
	}
}
