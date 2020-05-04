package ContaV1;

public class Main {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente();
		Conta c1 = new Conta();
		c1.titular = cli1;
		
		Cliente cli2 = new Cliente();
		Conta c2 = new Conta();
		c2.titular = cli2;
		
		c1.numero = 123;
		c1.numero = 321;
		//c1.titular = "Francisco Alvarez";
		cli1.nome = "Francisco";
		cli1.sobrenome = "Alvarez";
		//c2.titular = "Maria Fernanda";
		cli2.nome = "Maria";
		cli2.sobrenome = "Fernanda";
		c1.saldo = 10000;
		c2.saldo = 0;
		c1.limite = 5000;
		c2.limite = 2000;
		
		System.out.println("Titular: " + cli1.nome + " " + cli1.sobrenome + "\nSaldo: " + c1.saldo);
		System.out.println("Titular: " + cli2.nome + " " + cli2.sobrenome + "\nSaldo: " + c2.saldo);
		
		if(c1.saca(5000)) {
			System.out.println("\n:.Transação realizada com sucesso.\nTitular: " + cli1.nome + " " + cli1.sobrenome + "\nSaldo: " + c1.saldo);
		}else {
			System.out.println("\n.:Erro ao realizar transação.\nPor favor, verifique se o valor infomado é positivo e se possui saldo suficiente para transação e tente novamente mais tarde.");
		}
		
		if(c1.deposita(50)) {
			System.out.println("\n:.Transação realizada com sucesso.\nTitular: " + cli1.nome + " " + cli1.sobrenome + "\nSaldo: " + c1.saldo);
		}else {
			System.out.println("\n.:Erro ao realizar transação.\nPor favor, verifique se o valor infomado é positivo e tente novamente mais tarde.");
		}
		
		if(c1.tranfere(c2, 10000)) {
			System.out.println("\n:.Transação realizada com sucesso.");
			System.out.println("Titular: " + cli1.nome + " " + cli1.sobrenome + "\nSaldo: " + c1.saldo);
			System.out.println("Titular: " + cli2.nome + " " + cli2.sobrenome + "\nSaldo: " + c2.saldo);
		}else {
			System.out.println("\n.:Erro ao realizar transação.\nPor favor, verifique se o valor infomado é positivo e se possui saldo suficiente para transação e tente novamente mais tarde.");
			System.out.println("Titular: " + cli1.nome + " " + cli1.sobrenome + "\nSaldo: " + c1.saldo);
			System.out.println("Titular: " + cli2.nome + " " + cli2.sobrenome + "\nSaldo: " + c2.saldo);
		}
	}
}
