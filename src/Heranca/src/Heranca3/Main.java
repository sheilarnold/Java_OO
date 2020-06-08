package Heranca3;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Tassio", "123456789-10");
		pessoa.setNome("Tassio Pinheiro");		
		pessoa.setNome("Tassio");
		
		Coordenador coordenador = new Coordenador("Carolina", "123456789-10", 10, 12345, 2500);
		
		
		System.out.println("TESTE HERANÇA EX01.\n");

		Projeto projeto = new Projeto("Desenvolvimento IA", "Professor Tassio", "Avalição dos algoritmos de Machine Learning");
		coordenador.adicionaProjeto(projeto);
		
		projeto = new Projeto("Business Intelligence", "Miguel", "Data Analitcs");
		coordenador.adicionaProjeto(projeto);
		
		
		System.out.println("Nome Funcionário: "+ coordenador.getNome());
		System.out.println("CPF Funcionário: "+ coordenador.getCpf());
		System.out.println("Tempo de Serviço: "+ coordenador.tempoDeServico +" anos.");
		System.out.println("Matriculo: "+ coordenador.matricula);
		System.out.println("Salario Base: "+ coordenador.salarioBase);
		
		
		System.out.println(coordenador.toString());		
		System.out.println();
		coordenador.imprimirProjetos();
	}

}
