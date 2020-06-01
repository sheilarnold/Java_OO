package Main;

public class Main {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("Astrid Asmann", "123465789", "Desenvolvedor");
		System.out.println(cliente.toString());
		
		Conta cc = new ContaCorrente(cliente, 11,111);
		cc.depositar(100.0);
			
		Conta cp = new ContaPoupanca(cliente, 11, 110);
		cp.depositar(200.0);
		
		cc.transferir(10, cp);
		
		System.out.println("\nSaldos:\n	Conta Corrente: " + cc.getSaldo() + "\n	Conta Poupança: " + cp.getSaldo() + "\n");
		
		cc.sacar(50);
		cp.sacar(5);
		
		System.out.println("\nSaldos:\n	Conta Corrente: " + cc.getSaldo() + "\n	Conta Poupança: " + cp.getSaldo() + "\n");
		
		
		//Adiconar serviços e empréstimos
		Emprestimos emprestimoPessoal = new EmprestimoPessoal(cc, 50.000, 0.3, 24);
		Emprestimos creditoVeiculo = new CreditoVeiculo(cc, 85.000, 1.5, 60);
		Emprestimos creditoImobiliario = new CreditoImobiliario(cc, 350.000, 0.05, 360);
		Seguros servico = new SeguroDeVida(500.000);
		
		cc.setEmprestimo(emprestimoPessoal);
		cc.setEmprestimo(creditoVeiculo);
		cc.setEmprestimo(creditoImobiliario);
		
		
		cc.setServicos(servico);
		
		System.out.println("Serviços:\n	"+ cc.emprestimo.toString() + "\n" + cc.servico.toString());
		
		
		//Calcular o imposto de renda
		//CalculadorImposto.calcular(cc);
	}
}
