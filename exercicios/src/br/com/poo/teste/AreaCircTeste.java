package br.com.poo.teste;

import br.com.poo.objetos.AreaCirc;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5);
		double area = a.area();
		
		System.out.println(area);
	}
}
