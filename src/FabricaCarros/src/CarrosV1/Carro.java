package CarrosV1;

public class Carro {
	String cor, modelo;
	double velocidadeAtual, velocidadeMaxima;
	Motor motor;
	
	void liga() {
		System.out.println("O carro está ligado.");
	}
	
	boolean acelera(double qtd) {
		if(this.velocidadeMaxima >= qtd) {
			this.velocidadeAtual += qtd;
			return true;
		}else {
			return false;
		}
	}
	
	int pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		
		return 3;
	}
}
