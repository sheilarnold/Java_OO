package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta c1 = new Conta();
		
		boolean ok = false;
		while(ok != true) {
			System.out.print("Qual o tipo de pessoa?\n1 - Física\n2 - Jurídica\n.:");
			int tipo = input.nextInt();
			if(tipo == 1) {
				PessoaFisica pessoa = new PessoaFisica();
				c1.setFisica(pessoa);
				c1.setTipo("Física");
				
				System.out.print("Informe o seu nome: ");
				input = new Scanner(System.in);
				c1.setTitular(input.nextLine());
				
				System.out.print("Informe o seu CPF: ");
				input = new Scanner(System.in);
				c1.getFisica().setCpf(input.nextInt());
				
				System.out.print("Informe o seu endereço: ");
				input = new Scanner(System.in);
				c1.getFisica().setEndereco(input.nextLine());
				
				System.out.print("Informe a agência: "); 
				input = new Scanner(System.in);
				c1.setAgencia(input.nextInt());
				
				ok = true;
			}if(tipo == 2) {
				PessoaJuridica pessoa = new PessoaJuridica();
				c1.setJuridica(pessoa);
				c1.setTipo("Jurídica");
				
				System.out.print("Informe o seu nome: ");
				input = new Scanner(System.in);
				c1.setTitular(input.nextLine());
				
				System.out.print("Informe o seu CNPJ: ");
				input = new Scanner(System.in);
				c1.getJuridica().setCnpj(input.nextInt());
				
				System.out.print("Informe o seu endereço: ");
				input = new Scanner(System.in);
				c1.getJuridica().setEndereco(input.nextLine());
				
				System.out.print("Informe a agência: ");
				input = new Scanner(System.in);
				c1.setAgencia(input.nextInt());
				
				ok = true;				
			}else if((tipo != 1) && (tipo != 2)){
				System.out.println("**Opção inexistente!\n");
			}
		}
		
		input = new Scanner(System.in);
		int op = 1;
		while(op != 0) {
			System.out.print("Deseja realizar algum depósito?\n1 - Sim\n0 - Não\n.:");
			input = new Scanner(System.in);
			op = input.nextInt();
			if(op == 1) {
				System.out.print("Informe o valor de depósito: ");
				double deposito = input.nextDouble();
				if(c1.deposita(deposito)) {
					System.out.println("\nDepósito realizado com sucesso!\n\n");
				}else {
					System.out.println("\nOcorreu um erro ao realizar a transação!\n\n");
				}
			}if((op != 0) && (op != 1)) {
				System.out.println("Opção inexistente!\n");
			}
		}
						
		System.out.println("\n*******************");
		System.out.print("Pessoa " + c1.getTipo() + "\n   Titular: " + c1.getTitular());
		if(c1.getTipo() == "Física") {
			System.out.print("\n   CPF: " + c1.getFisica().getCpf() + "\n   Endereço: " + c1.getFisica().getEndereco());
		}else if(c1.getTipo() == "Jurídica"){
			System.out.print("\n   CNPJ: " + c1.getJuridica().getCnpj() + "\n   Endereço: " + c1.getJuridica().getEndereco());
		}
		System.out.print("\n\nDados da conta:\n   Agência: " + c1.getAgencia() + "\n   Saldo: " + c1.getSaldo());
	}
}
