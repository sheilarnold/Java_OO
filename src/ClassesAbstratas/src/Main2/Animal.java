package Main2;

public abstract class Animal {
	String genero;
	
	//M�todo abstrato
	public abstract void imprimirDados();
	
	//M�todo regular
	public String getDescricao() {
		return genero;
	}
}