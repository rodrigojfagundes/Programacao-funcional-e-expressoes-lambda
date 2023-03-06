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
		
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		//criando uma STREAM de STRINGS de nome ST2... e com o metodo STREAM.OF
		//adicionando os valores a essa STREAM
		Stream<String> st2 = Stream.of("maria", "alex", "bob");
		
		System.out.println(Arrays.toString(st2.toArray()));
		
		
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
	}
}