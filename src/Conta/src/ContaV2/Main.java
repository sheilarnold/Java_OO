package ContaV2;

public class Main {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente();
		Conta c1 = new Conta();
		c1.titular = cli1;
		
		Cliente cli2 = new Cliente();
		Conta c2 = new Conta();
		c2.titular = cli2;
		
		c1.setNumero(123);
		c2.setNumero(321);
		//c1.titular = "Francisco Alvarez";
		cli1.setNome("Francisco");
		cli1.setSobrenome("Alvarez");
		//c2.titular = "Maria Fernanda";
		cli2.setNome("Maria");
		cli2.setSobrenome("Fernanda");
		c1.setSaldo(10000);
		c2.setSaldo(0);
		c1.setLimite(5000);
		c2.setLimite(2000);
		
		System.out.println("Titular: " + cli1.getNome() + " " + cli1.getSobrenome() + "\nSaldo: " + c1.getSaldo());
		System.out.println("Titular: " + cli2.getNome() + " " + cli2.getSobrenome() + "\nSaldo: " + c2.getSaldo());
		
		if(c1.saca(5000)) {
			System.out.println("\n:.Transação realizada com sucesso.\nTitular: " + cli1.getNome() + " " + cli1.getSobrenome() + "\nSaldo: " + c1.getSaldo());
		}else {
			System.out.println("\n.:Erro ao realizar transação.\nPor favor, verifique se o valor infomado é positivo e se possui saldo suficiente para transação e tente novamente mais tarde.");
		}
		
		if(c1.deposita(50)) {
			System.out.println("\n:.Transação realizada com sucesso.\nTitular: " + cli1.getNome() + " " + cli1.getSobrenome() + "\nSaldo: " + c1.getSaldo());
		}else {
			System.out.println("\n.:Erro ao realizar transação.\nPor favor, verifique se o valor infomado é positivo e tente novamente mais tarde.");
		}
		
		if(c1.tranfere(c2, 10000)) {
			System.out.println("\n:.Transação realizada com sucesso.");
			System.out.println("Titular: " + cli1.getNome() + " " + cli1.getSobrenome() + "\nSaldo: " + c1.getSaldo());
			System.out.println("Titular: " + cli2.getNome() + " " + cli2.getSobrenome() + "\nSaldo: " + c2.getSaldo());
		}else {
			System.out.println("\n.:Erro ao realizar transação.\nPor favor, verifique se o valor infomado é positivo e se possui saldo suficiente para transação e tente novamente mais tarde.");
			System.out.println("Titular: " + cli1.getNome() + " " + cli1.getSobrenome() + "\nSaldo: " + c1.getSaldo());
			System.out.println("Titular: " + cli2.getNome() + " " + cli2.getSobrenome() + "\nSaldo: " + c2.getSaldo());
		}
	}
}
