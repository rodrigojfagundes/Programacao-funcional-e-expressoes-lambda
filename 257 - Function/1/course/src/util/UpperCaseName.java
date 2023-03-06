package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String>{
	
	@Override
	public String apply(Product p) {
		//pegando o NOME do PRODUCT P q foi passado ali em cima
		//e retornando ele em letra maiuscula :)
		return p.getName().toUpperCase();
	}

}
