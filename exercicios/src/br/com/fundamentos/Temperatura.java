package br.com.fundamentos;

public class Temperatura {

	private static final double FATOR1 = 5.0;
	private static final double FATOR2 = 9.0;
	private static final double AJUSTE = 32;
	
	
	public static void main(String[] args) {
		System.out.println("O Resultado Fahrenheit é: " + calcuularTemperatura(50));
		System.out.println("O Resultado Fahrenheit é: " + calcuularTemperatura(59));
	}
	
	private static double calcuularTemperatura(double temperatura) {
		return (temperatura - AJUSTE) * FATOR1 / FATOR2;
	}
	

}
