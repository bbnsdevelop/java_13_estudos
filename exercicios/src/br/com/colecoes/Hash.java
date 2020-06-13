package br.com.colecoes;

import java.util.HashSet;
import java.util.Set;

import br.com.poo.objetos.Usuario;

public class Hash {
	public static void main(String[] args) {
		Set<Usuario> usuarios = new HashSet<>();
		
		
		usuarios.add(new Usuario("Bruno","brunno@gmail.com"));
		usuarios.add(new Usuario("Bruno","brunno@gmail.com"));
		usuarios.add(new Usuario("Tacy","tacy@gmail.com"));
		usuarios.add(new Usuario("Tacy","tacy@gmail.com"));
		
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.contains(new Usuario("Bruno", "brunno@gmail.com")));
		System.out.println(usuarios.contains(new Usuario("Brunno", "brunno@gmail.com")));
		
	}
}
