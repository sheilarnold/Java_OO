package OO_basico;

public class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Data d1 = new Data();
		
		c1.dataAbertura = d1;
			
		if(d1.dataAbertura(6, 4, 2020)) {
			c1.titular = "Maristela";
			c1.numero = 123;
			c1.agencia = "456";
			c1.saldo = 50000;
			//c1.dataAbertura = "06/08/2019";
			
			System.out.println("Titular: " + c1.titular + "\nNúmero: " + c1.numero + "\nAgência: " + c1.agencia + "\nData de abertura: " + d1.dia + "/" + d1.mes + "/" + d1.ano + "\nSaldo: " + c1.saldo + "\nRendimento mensal de R$: " + c1.calculaRendimento());
			
			if(c1.deposita(100.0)) {
				System.out.println("\n:.Transação realizada com sucesso!");
				c1.showInfo();
			}else {
				System.out.println("\n.:Erro ao realizar transação!\nVerifique se o valor informado é positivo e tente novamente mais tarde.");
				c1.showInfo();
			}
		}else {
			System.out.println("Data de abertura informada é inválida!");
		}
	}
}
