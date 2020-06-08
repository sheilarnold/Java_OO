package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Conta contaFisica = new ContaFisica("12345-6", 100, "Alana");
		
		System.out.println("Digite o valor que deseja depositar:");
		Scanner input = new Scanner(System.in);
		double valor = input.nextDouble();		
		contaFisica.deposito(valor);
		System.out.println(contaFisica.toString());
		System.out.println();
		
		System.out.println("Digite o valor que deseja sacar:");
		valor = input.nextDouble();
		contaFisica.saque(valor);
		System.out.println(contaFisica.toString());
		System.out.println();
		
		
		
		input.close();

	}

}
