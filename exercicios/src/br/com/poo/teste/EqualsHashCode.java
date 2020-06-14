package br.com.poo.teste;

import br.com.poo.objetos.Usuario;

public class EqualsHashCode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "joaão";
		u1.email = "joao@gmail.com";
		
		Usuario u2 = new Usuario();		
		u2.nome = "joaão";
		u2.email = "joao@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		Usuario u3 = new Usuario();
		
		System.out.println(u1.equals(u3));
		
	}
}
