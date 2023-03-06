package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//criando uma STREAM da LIST acima... chamda de ST1... e dps
		//o.MAP q vai pegar cada ELEMENTO X da LISTA e transformar
		//em outro valor... exemplo X = X * 10...
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		

		int sum = list.stream().reduce(0, (x, y) -> x + y);
		
		System.out.println("sum" + sum);

		
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));
	}
}