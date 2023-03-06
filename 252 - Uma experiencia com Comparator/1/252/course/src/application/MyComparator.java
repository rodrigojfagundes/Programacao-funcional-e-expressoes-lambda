package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{

	
	
	
	//metodo COMPARE q irá receber 2 PRODUTOS(classe PRODUCT), e ira comparar
	//o PRECO desses 2 product, e ira retornar um valor em INT
	@Override
	public int compare(Product p1, Product p2) {
		//pegando o valor do PRODUCT P1 e comparando com o PRODUCT P2
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
