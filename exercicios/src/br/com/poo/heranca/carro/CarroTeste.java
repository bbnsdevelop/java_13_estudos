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
		
		carro = new Ferrari();
		carro.ligar();
		
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);
		carro.acelerar();
		carro.acelerar();		
		
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);		
		
		carro.frear();
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);
		carro.frear();
		carro.frear();
		carro.frear();
		System.out.println("Velocidade atual: "+ carro.velocidadeAtual);
		
		
		
	}
}
