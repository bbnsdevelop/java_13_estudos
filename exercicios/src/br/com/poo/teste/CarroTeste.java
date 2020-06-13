package br.com.poo.teste;

import br.com.poo.objetos.Carro;

public class CarroTeste {

	public static void main(String[] args) {

		Carro gol = new Carro();
		gol.ligar();
		System.out.println(gol.motor.giros());
		gol.acelerar();
		System.out.println(gol.motor.giros());
		gol.frear();
		System.out.println(gol.motor.giros());
		gol.frear();
		System.out.println(gol.motor.giros());
		gol.frear();
		System.out.println(gol.motor.giros());
		gol.frear();
		
	}

}
