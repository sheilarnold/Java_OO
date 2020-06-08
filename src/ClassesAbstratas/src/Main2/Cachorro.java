package Main2;


public class Cachorro extends Animal {
	private String raca;	

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void imprimirDados() {
		System.out.println("Animal do gênero: " + super.getDescricao() + "\nDa raça: " + raca);
	}
}
