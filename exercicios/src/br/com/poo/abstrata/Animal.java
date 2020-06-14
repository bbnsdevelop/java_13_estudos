package br.com.poo.abstrata;

public abstract class Animal {
	private static final String CO2 = "CO2";
	
	public String respirar() {
		return CO2;
	}
	
	public abstract String mover();

}
