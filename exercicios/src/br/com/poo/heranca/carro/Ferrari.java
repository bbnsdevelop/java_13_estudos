package br.com.poo.heranca.carro;

public class Ferrari extends Carro implements Esportivo{
	
	
	@Override
	void acelerar() {		
		this.velocidadeAtual += 15; 
	}
	
	@Override
	void frear() {
		if(this.velocidadeAtual != 0) {
			this.velocidadeAtual -= 15;
		}
		
	}

	@Override
	public void ligarTurbo() {
		this.velocidadeAtual += 50;
	}

	@Override
	public void desligarTurbo() {
		this.velocidadeAtual -= 20;
	}

}
