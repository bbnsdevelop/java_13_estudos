package br.com.colecoes;

import java.util.ArrayList;

import br.com.poo.objetos.Usuario;

public class UsuarioList {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario();
		u1.nome = "joaão";
		u1.email = "joao@gmail.com";
		
		Usuario u2 = new Usuario();		
		u2.nome = "joaão";
		u2.email = "joao@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		Usuario u3 = new Usuario();
		
		lista.add(u1);
		lista.add(u2);
		lista.add(u3);
		
		for (Usuario usuario : lista) {			
			System.out.println(usuario.toString());
		}
	}

}
