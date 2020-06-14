package br.com.poo.teste;

import br.com.poo.objetos.Data;

public class DataTeste {

	public static void main(String[] args) {
		
		
		Data data1 = new Data();
		
		data1.dia = 15;
		data1.mes = 12;
		data1.ano = 2020;
		
		
		Data data2 = new Data();
		
		data2.dia = 30;
		data2.mes = 8;
		data2.ano = 2020;

		
		
		System.out.println(data1.toString());
		
		System.out.println(data2.toString());

	}

}
