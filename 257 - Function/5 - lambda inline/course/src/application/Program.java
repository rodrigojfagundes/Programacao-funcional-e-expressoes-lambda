package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.50));
		list.add(new Product("hd case", 80.90));
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}
}
