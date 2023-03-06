package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
		
		
		//usando LAMBDAS para remover os PRODUTOS P q o PRICE e MAIOR q 100
		list.removeIf(p -> p.getPrice() >= 100);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
}
