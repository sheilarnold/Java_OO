package Construtor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Conta conta =  new Conta(0.0, "12345-6", "Corin");
		conta.imprimirDados();

		Scanner input = new Scanner(System.in);
		System.out.println("Informe o valor de depósito:");
		
		//Utilizando parse
		//String valorDeposito = input.nextLine();
		//conta.deposito(Double.parseDouble(valorDeposito));
		
		//Sem parse
		double valorDeposito = input.nextDouble();
		conta.deposito(valorDeposito);
		conta.imprimirDados();
		
		System.out.println("Informe o valor de depósito:");				
		conta.deposito(input.nextDouble());
		conta.imprimirDados();
		
		input.close();
	}
}
