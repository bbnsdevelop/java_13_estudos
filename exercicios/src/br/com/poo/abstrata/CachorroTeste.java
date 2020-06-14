package br.com.poo.abstrata;

public class CachorroTeste {
	public static void main(String[] args) {
		Mamifero pitbul = new Cachorro();
		
		System.out.println(pitbul.respirar());
		System.out.println(pitbul.mamar());
		System.out.println(pitbul.mover());
	}
}
