package br.com.stream.testes;

import br.com.stream.interfacesFuncional.Calculo;

public class CalculoTeste {
	
	
	public static void main(String[] args) {
		
		// Note o polimorfismo gerado durante a excu��o do programa onde o objeto 'calculo'
		// assumiu diversos comportamentos
		
		Calculo calculo = (x,y) -> x+y;		
		System.out.println("Soma: "+calculo.executar(6, 4));
		
		calculo = (x,y) -> x -y;
		System.out.println("Subtra��o: "+calculo.executar(6, 4));
		
		calculo = (x,y) -> x * y;		
		System.out.println("Multiplica��o: "+ calculo.executar(5, 3));
		
		
		calculo = (x,y) ->{
			if(x == 0) {
				return 0;
			}else {
				return x / y;
			}
		};
		
		System.out.println("divis�o: "+ calculo.executar(0, 3));
		System.out.println("divis�o: "+ calculo.executar(15, 3));
		
		
	}

}
