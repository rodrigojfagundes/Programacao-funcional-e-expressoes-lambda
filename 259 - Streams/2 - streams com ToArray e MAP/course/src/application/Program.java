package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
			
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//criando uma STREAM de INTEIROS q vamos chamar ela de ST1
		//q vai receber uma LISTA de SSTREAM... no caso a lista LIST q fizemos acima
		//
		//dps estamo chamando o .MAP e assim aplicando uma FUNCAO a cada VALOR da STREAM
		//q sao os valores da lista LIST... ou seja chamando o .MAP para multiplicar
		//os valores por 10...
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
	}
}