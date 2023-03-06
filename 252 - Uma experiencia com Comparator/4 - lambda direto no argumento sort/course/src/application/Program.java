package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
				
		list.add(new Product("tv", 900.00));
		list.add(new Product("notebook", 1200.00));
		list.add(new Product("tablet", 450.00));
		
		//chamando o SORT para organizar passando 
		//
		//criando uma funcao LAMBDA -> FUNCAO ANONIMA
		//o LAMBDA recebe os PARAMETROS P1 e P2 (product1 e product2)
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
