package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Product> list = new ArrayList<>();
				
		list.add(new Product("tv", 900.00));
		list.add(new Product("notebook", 1200.00));
		list.add(new Product("tablet", 450.00));
		
		
		Comparator<Product> comp = new Comparator<Product>() {
			//vamos fazer a IMPLEMENTACAO DE UMA CLASSE ANONIMA a baixo...
				//o metodo COMPARE vai receber 2 PRODUCT, (P1 e P2) e vai comparar
				//o preco deles
			@Override
			public int compare(Product p1, Product p2) {
				//aqui nos estamos comparando o P1 com o P2
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);
		
		for(Product p : list) {
			System.out.println(p);
			
		}
	}
}
