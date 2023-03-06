//interface funcional CONSUMER
//q é parametrizada no tipo T, e ela tem um unico metodo abstrato q é o ACCEPT
//q é um void... Executa uma acao e nao retorna nada

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.50));
		list.add(new Product("hd case", 80.90));
		
		
		list.forEach(new PriceUpdate());
		
		list.forEach(System.out::println);
	}
}
