package br.com.stream;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import br.com.stream.dto.Produto;

public class Teste {

	public static void main(String[] args) {

		Function<Produto, Double> aplicarDesconto = p -> p.getPreco() * (1 - p.getDesconto());
		
		UnaryOperator<Double> aplicarImposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> aplicarFrete = precoComFrete -> precoComFrete >= 3000 ? precoComFrete + 100: precoComFrete + 50;		
		UnaryOperator<Double> aplicarLimitacaoDuasCasasDecimais = precoCalculado -> Double.parseDouble(String.format("%.2f", precoCalculado).replace(",", "."));
		Function<Double, String>  formatar = valorFormatado -> ("R$"+valorFormatado).replace(".", ",");
		
		Produto tv = new Produto("TV", 5000, 0.13);
		String preco = aplicarDesconto
						.andThen(aplicarImposto)
						.andThen(aplicarFrete)
						.andThen(aplicarLimitacaoDuasCasasDecimais)
						.andThen(formatar).apply(tv);
		System.out.println(preco);

	}

}
