package br.com.poo.heranca.carro;

public class Ferrari extends Carro{
	
	
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

}
