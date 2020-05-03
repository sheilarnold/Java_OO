package Main;

public class Conta {
	private String tipo, titular;
	private int agencia;
	private double saldo = 0;
	PessoaJuridica juridica;
	PessoaFisica fisica;
	
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
	
	public boolean saca(double valor) {
		if((valor >= 0) && (this.saldo >= valor)) {
			this.saldo -= valor;
			return(true);
		}else {
			return(false);
		}
	}
	
	public void informacoes() {
		System.out.println("\n*******************");
		System.out.print("Pessoa " + getTipo() + "\n   Titular: " + getTitular());
		if(getTipo() == "Física") {
			System.out.print("\n   CPF: " + getFisica().getCpf() + "\n   Endereço: " + getFisica().getEndereco());
		}else if(getTipo() == "Jurídica"){
			System.out.print("\n   CNPJ: " + getJuridica().getCnpj() + "\n   Endereço: " + getJuridica().getEndereco());
		}
		System.out.print("\n\nDados da conta:\n   Agência: " + getAgencia() + "\n   Saldo: " + getSaldo() + "\n");
	}
}
