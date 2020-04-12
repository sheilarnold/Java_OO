package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta c1 = new Conta();
		
		boolean ok = false;
		while(ok != true) {
			System.out.print("Qual o tipo de pessoa?\n1 - F�sica\n2 - Jur�dica\n.:");
			int tipo = input.nextInt();
			if(tipo == 1) {
				PessoaFisica pessoa = new PessoaFisica();
				c1.setFisica(pessoa);
				c1.setTipo("F�sica");
				
				System.out.print("Informe o seu nome: ");
				input = new Scanner(System.in);
				c1.setTitular(input.nextLine());
				
				System.out.print("Informe o seu CPF: ");
				input = new Scanner(System.in);
				
				c1.getFisica().setCpf(input.nextInt());
				
				System.out.print("Informe o seu endere�o: ");
				input = new Scanner(System.in);
				c1.getFisica().setEndereco(input.nextLine());
				
				System.out.print("Informe a ag�ncia: "); 
				input = new Scanner(System.in);
				c1.setAgencia(input.nextInt());
				
				ok = true;
			}if(tipo == 2) {
				PessoaJuridica pessoa = new PessoaJuridica();
				c1.setJuridica(pessoa);
				c1.setTipo("Jur�dica");
				
				System.out.print("Informe o seu nome: ");
				input = new Scanner(System.in);
				c1.setTitular(input.nextLine());
				
				System.out.print("Informe o seu CNPJ: ");
				input = new Scanner(System.in);
				c1.getJuridica().setCnpj(input.nextInt());
				
				System.out.print("Informe o seu endere�o: ");
				input = new Scanner(System.in);
				c1.getJuridica().setEndereco(input.nextLine());
				
				System.out.print("Informe a ag�ncia: ");
				input = new Scanner(System.in);
				c1.setAgencia(input.nextInt());
				
				ok = true;				
			}else if((tipo != 1) && (tipo != 2)){
				System.out.println("**Op��o inexistente!\n");
			}
		}
		
		input = new Scanner(System.in);
		int op = 1;
		
		while(op != 0) {
			System.out.print("\nDeseja realizar alguma dessas transa��es?\n    1 - Dep�sito\n    2 - Saque\n    0 - Sair\n:.");
			input = new Scanner(System.in);
			op = input.nextInt();
			if(op == 1) {
				System.out.print("Informe o valor de dep�sito: ");
				double deposito = input.nextDouble();
				if(c1.deposita(deposito)) {
					System.out.println("\nDep�sito realizado com sucesso!");
				}else {
					System.out.println("\nOcorreu um erro ao realizar a transa��o!\n");
				}
			}else if(op == 2) {
				if(c1.getSaldo() != 0) {
					System.out.print("Informe o valor de saque: ");
					double valor = input.nextDouble();
					if(valor <= c1.getSaldo()) {
						if(c1.saca(valor)) {
							System.out.println("\nSaque realizado com sucesso!");
						}else {
							System.out.println("\nOcorreu um erro ao realizar a transa��o!\n");
						}
					}else {
						System.out.print("\nO valor informado para o saque � maior do que o valor presente na conta, por favor, tente novamente mais tarde.\nOBS:. Certifique-se de que o valor a ser sacado � menor ou igual ao valor presente na conta.\n");}
				}else {
						System.out.println("O saque n�o pode ser realizado pois n�o foi debitado nenhum valor � conta em quest�o, por favor, tente novamente mais tarde.\nOBS:. Certifique-se de que a conta possui saldo antes de tentar ralizar algum saque.");
				}
			}else if ((op != 0) && (op != 1) && (op != 0)) {
				System.out.println("Op��o inexistente!\n");
			}
			c1.informacoes();
		}
	}
}
