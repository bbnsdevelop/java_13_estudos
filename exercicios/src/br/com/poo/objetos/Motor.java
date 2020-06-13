package br.com.poo.objetos;

public class Motor {
	double fatorInjecao = 1;
	boolean ligado = false;
	
	public int giros() {
		if(!this.ligado) {
			return 0;
		}else {
			return (int) Math.round(this.fatorInjecao * 3000);			
		}
	}
}
