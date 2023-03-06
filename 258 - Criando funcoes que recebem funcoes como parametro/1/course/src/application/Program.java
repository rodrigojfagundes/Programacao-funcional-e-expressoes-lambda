//fazer um programa, q a partir de uma lista de produtos, calcule
//a soma dos precos somente dos produtos cujo nome comeca com "T"

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.50));
		list.add(new Product("hd case", 80.90));
		
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list);
		
		System.out.println("sum =" + String.format("%.2f", sum));
		
	}
}
