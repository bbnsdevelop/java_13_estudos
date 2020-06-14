package br.com.colecoes;

import java.util.HashSet;
import java.util.Set;

import br.com.poo.objetos.Produto;

public class ProdutoHashSet {
	
	public static void main(String[] args) {
		Set<Produto> produtos = new HashSet<>();
		
		Produto p1 = new Produto("Mouse",12.00);
		Produto p2 = new Produto("Mouse",13.00);
		Produto p3 = new Produto("Mouse",14.00);
		Produto p4 = new Produto("Mouse",15.00);
		Produto p5 = new Produto("Mouse",15.00);
		Produto p6 = new Produto("Mouse",17.00);
		Produto p7 = new Produto("Mouse",16.00);
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		
		System.out.println(produtos.contains(p7));
		
		System.out.println(produtos.size());
		
	}

}
