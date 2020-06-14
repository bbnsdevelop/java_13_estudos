package br.com.poo.objetos;

public class Produto {
	
	public String nome;
	public double preco;
	public static double desconto = 0.25;
	
	
	
	
	public Produto() {

	}


	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}


	public Double applicarDesconto() {
		Double descontoAplicado = preco * (1 - desconto);
		return descontoAplicado;
	}
	
	
	public void mostarProduto(Double precoComDesconto) {
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(precoComDesconto);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}
	
	

}
