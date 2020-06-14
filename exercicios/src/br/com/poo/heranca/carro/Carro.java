package br.com.poo.heranca.carro;

public class Carro {
	
	Double velocidadeAtual;
	
	
	void acelerar() {
		this.velocidadeAtual += 5;
	}
	void frear() {
		if(this.velocidadeAtual != 0) {
			this.velocidadeAtual -= 5;
		}
	}
	
	void ligar() {
		this.velocidadeAtual = 0.0;
	}

}
