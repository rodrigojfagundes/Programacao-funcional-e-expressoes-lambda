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
		
		Stream<Integer> st1 = list.stream();
		
		System.out.println(Arrays.toString(st1.toArray()));
	}
}