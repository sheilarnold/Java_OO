package Main;

import java.util.Scanner;

public class Main {
	//Aula sobre construtores
	public static void main(String[] args) {
		Conta conta = new Conta(1000, "123", "Sheila");
		conta.imprimirDados();
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Informe o valor a ser depositado: ");
		double valor = input.nextDouble();
		
		//conversão da string em double
		conta.deposito(valor);//->Sem Parse
		//conta.deposito(Double.parseDouble(valor));//->Parse
		System.out.println("\n***************");
		conta.imprimirDados();	
		
		input.close();
	}
}
