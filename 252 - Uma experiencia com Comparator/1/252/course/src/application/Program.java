package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product("tv", 900.00));
		list.add(new Product("notebook", 1200.00));
		list.add(new Product("tablet", 450.00));
		
		//chamando a funcao SORT de list para comparar os dados
		list.sort(new MyComparator());
		
		for(Product p : list) {
			System.out.println(p);
			
		}
	}
}
