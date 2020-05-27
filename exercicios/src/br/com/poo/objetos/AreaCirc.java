package br.com.poo.objetos;

public class AreaCirc {
	public double raio;
	// poderia usar a classe Math do java
	private static final double PI = 3.14;
	
	public AreaCirc(double raio) {		
		this.raio = raio;
	}
	
	public double area() {
		return PI * Math.pow(raio, 2);
	}
	
	
	
	
}
