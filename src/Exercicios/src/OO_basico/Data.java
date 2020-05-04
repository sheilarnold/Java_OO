package OO_basico;

import java.util.Calendar;

public class Data {
	int dia, mes, ano;
	
	void inserir(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	boolean dataAbertura(int d, int m, int a) {
		//*****NÃO CONSIDERA ANO BISSEXTO****
		Calendar cal = Calendar.getInstance();
		if(a < cal.get(Calendar.YEAR)) {
			//se o ano informado for menor que o ano atual...
			if(m <= 12 && m >= 1) {
				//se o mês informado estiver compreendido dentro dos meses do ano
				if(d <= 31 && d >= 1) {
					//Se o dia estiver compreendido entre o dia 1 e 31
					inserir(d, m, a);
					return true;
				}else {
					return false;
				}
			} else {
				return false;
			}
		}else if(a == cal.get(Calendar.YEAR)) {
			//se o ano informado for igual ao atual
			if(m <= 12 && m >= 1) {
				//se o mês informado estiver compreendido dentro dos meses do ano
				if(m < cal.get(Calendar.MONTH) + 1) {
					//se o mês informado for menor que o mês atual
					if(d <= 31 && d >= 1) {
						//Se o dia estiver compreendido entre o dia 1 e 31
						inserir(d, m, a);
						return true;
					}else {
						return false;
					}
				}else {
					//se o mês informado for igual ao atual
					if(d <= cal.get(Calendar.DAY_OF_MONTH)) {
						//se o dia informado for menor ou igual ao do mes atual...
						inserir(d, m, a);
						return true;
					}else {
						return false;
					}
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}