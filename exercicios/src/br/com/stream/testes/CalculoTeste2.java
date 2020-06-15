package br.com.stream.testes;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
	
	
	public static void main(String[] args) {
		
		// Note o polimorfismo gerado durante a excu��o do programa onde o objeto 'calculo'
		// assumiu diversos comportamentos
		
		BinaryOperator<Double> calculo = (x,y) -> x + y;		
		System.out.println("Soma: "+calculo.apply(6D, 4D));
		
		calculo = (x,y) -> x - y; // ---->  polimorfismo
		System.out.println("Subtra��o: "+calculo.apply(6D, 4D));
		
		calculo = (x,y) -> x * y;		
		System.out.println("Multiplica��o: "+ calculo.apply(5D, 3D));
				
		calculo = (x,y) ->{
			if(x == 0) {
				return 0.0;
			}else {
				return x / y;
			}
		};
		
		System.out.println("divis�o: "+ calculo.apply(0.0, 3.0));
		System.out.println("divis�o: "+ calculo.apply(15.0, 3.0));
		
		
	}

}
