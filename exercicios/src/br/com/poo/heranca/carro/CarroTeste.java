package br.com.poo.heranca.carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro = new Civic();
		carro.ligar();
		
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);
		carro.acelerar();
		carro.acelerar();		
		
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);		
		
		carro.frear();
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);
		carro.frear();
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);

		System.out.println("----------------------------------");
		
		Ferrari ferrari = new Ferrari();
		ferrari.ligar();
				
		System.out.println("Velocidade atual: "+ ferrari.velocidadeAtual);
		ferrari.acelerar();
		ferrari.acelerar();		
		System.out.println("Velocidade atual: "+ ferrari.velocidadeAtual);	
		
		ferrari.ligarTurbo();
		System.out.println("Velocidade atual com turbo: "+ ferrari.velocidadeAtual);		
		
		ferrari.frear();
		ferrari.desligarTurbo();
		System.out.println("Velocidade atual: "+ ferrari.velocidadeAtual);
		ferrari.frear();
		ferrari.frear();
		
		System.out.println("Velocidade atual: "+ ferrari.velocidadeAtual);
		
		
		
	}
}
