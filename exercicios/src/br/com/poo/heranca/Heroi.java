package br.com.poo.heranca;

public class Heroi extends Jogador {
	

	@Override
	boolean atacar(Jogador opnente) {
		 boolean isSucess = super.atacar(opnente);
		if(isSucess) {
			opnente.vida -= 20;			
		}
		return isSucess;
	}
}
