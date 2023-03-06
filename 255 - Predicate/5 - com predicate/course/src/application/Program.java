package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

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

		//criando uma variavel PREDICATE do tipo PRODUCT q se chama de PRED
		//q recebe uma expressao lambda
		Predicate<Product> pred = p -> p.getPrice() >=100.0;
		
		//passando a variavel PRED q e o predicato feito ali na linha de cima
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
}
