package Main;

abstract class CalcularImposto implements Tributavel{
	private static double totalImposto;
	
	public static void calcular(Tributavel tributo) {
		//calculo do tributo
		totalImposto = 0; 
	}
	
	public static double getTotalImposto() {
		return totalImposto;
	}
}
