package br.com.poo.heranca;

import br.com.poo.heranca.enumeradores.Direcao;

public class Jogador {

	int vida = 100;
	int x;
	int y;

	boolean atacar(Jogador opnente) {
		int deltaX = Math.abs(x - opnente.x);
		int deltaY = Math.abs(y - opnente.y);

		if (deltaX == 0 && deltaY == 1) {
			opnente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			opnente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}

	boolean andar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}

		return true;
	}
}
