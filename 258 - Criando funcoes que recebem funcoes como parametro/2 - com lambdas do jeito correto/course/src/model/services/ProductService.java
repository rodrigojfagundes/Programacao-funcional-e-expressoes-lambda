package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	
	//metodo Filtered SUM.... Ou seja SOMA FILTRADA... q RECEBE uma LISTA de PRODUCT
	// evamos SOMAR o valor dos PRODUCTS q comecam com a letra T
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
