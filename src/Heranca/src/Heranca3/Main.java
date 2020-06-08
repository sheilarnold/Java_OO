package Heranca3;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Tassio", "123456789-10");
		pessoa.setNome("Tassio Pinheiro");		
		pessoa.setNome("Tassio");
		
		Coordenador coordenador = new Coordenador("Carolina", "123456789-10", 10, 12345, 2500);
		
		
		System.out.println("TESTE HERAN�A EX01.\n");

		Projeto projeto = new Projeto("Desenvolvimento IA", "Professor Tassio", "Avali��o dos algoritmos de Machine Learning");
		coordenador.adicionaProjeto(projeto);
		
		projeto = new Projeto("Business Intelligence", "Miguel", "Data Analitcs");
		coordenador.adicionaProjeto(projeto);
		
		
		System.out.println("Nome Funcion�rio: "+ coordenador.getNome());
		System.out.println("CPF Funcion�rio: "+ coordenador.getCpf());
		System.out.println("Tempo de Servi�o: "+ coordenador.tempoDeServico +" anos.");
		System.out.println("Matriculo: "+ coordenador.matricula);
		System.out.println("Salario Base: "+ coordenador.salarioBase);
		
		
		System.out.println(coordenador.toString());		
		System.out.println();
		coordenador.imprimirProjetos();
	}

}
