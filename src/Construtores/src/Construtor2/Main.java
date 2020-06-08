package Construtor2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o número da conta:");
		String nome = input.nextLine();
		System.out.println("Informe um valor para depósito:");
		String valor = input.nextLine();
		
		Conta conta = new Conta(Double.parseDouble(valor), nome);		
		System.out.println(conta.toString());
		
		System.out.println("Informe o valor de saque:");
		
		//Envio de menssagem para o objeto
		valor = input.nextLine();
		conta.saque(Double.parseDouble(valor));
		System.out.println(conta.toString());
		
		input.close();
	
}

}
