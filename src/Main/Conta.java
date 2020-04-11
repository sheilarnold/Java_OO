package Main;

public class Conta {
	private String tipo, titular;
	private int agencia;
	private double saldo = 0;
	PessoaJuridica juridica;
	PessoaFisica fisica;
	
		this.saldo = saldo;
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public PessoaJuridica getJuridica() {
		return juridica;
	}

	public void setJuridica(PessoaJuridica juridica) {
		this.juridica = juridica;
	}

	public PessoaFisica getFisica() {
		return fisica;
	}

	public void setFisica(PessoaFisica fisica) {
		this.fisica = fisica;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean deposita(double valor) {
		if(valor >= 0) {
			this.saldo += valor;
			return(true);
		}else {
			return(false);
		}
	}
}
