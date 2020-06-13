package br.com.poo.objetos;

public class Carro {
	
	public Motor motor = new Motor();
	
	public void acelerar() {
		if(motor.fatorInjecao > 2.6) {
			this.motor.fatorInjecao += 0.4;			
		}
	}
	
	public void frear() {
		if(motor.fatorInjecao > 0.5) {
			this.motor.fatorInjecao -= 0.4;			
		}
	}
	public void ligar() {
		this.motor.ligado = true;
	}
	
	public void desligar() {
		this.motor.ligado = false;
	}
	
	public boolean estaligado() {
		return this.motor.ligado;
	}
}
