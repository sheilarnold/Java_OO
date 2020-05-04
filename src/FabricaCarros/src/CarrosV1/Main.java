package CarrosV1;

public class Main {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		Motor meuMotor = new Motor();
			
		meuCarro.motor = meuMotor;
		
		meuCarro.cor = "Preto";
		meuCarro.modelo = "BMW 328i";
		meuMotor.potencia = 245;
		meuMotor.tipo = "Injeção";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 250;
		
		meuCarro.liga();
		if(meuCarro.acelera(300)) {
			System.out.println("Se quiser pisar, pode pisar, pois esse moço aguenta mais que " + meuCarro.velocidadeAtual);
		}else {
			System.out.println("Tá certo que é uma BMW mas dá uma manerada no acelerador meu bem, que esse moço aguenta até " + meuCarro.velocidadeMaxima);
		}
	}
}
