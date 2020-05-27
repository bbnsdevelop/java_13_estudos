package br.com.poo.teste;

import br.com.poo.objetos.Data;

public class ValorVsReferenciaTeste {

	
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a+" - "+b);
		
		Data d1 = new Data(1,6,2020);
		
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
				
	}
	
	static void voltarDataParaValorPadrao(Data d){
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	

}
