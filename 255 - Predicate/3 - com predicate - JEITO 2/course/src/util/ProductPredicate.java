package util;

import java.util.function.Predicate;

import entities.Product;

//criando a classe q ira IMPLEMENTAR a INTERFACE PREDICATE na classe PRODUCT
public class ProductPredicate implements Predicate<Product> {

	
	
	//metodo para o contrato da interface... O metodo q FAZ um TEST e retorna
	//VERDADEIRO ou FALSO
	@Override
	public boolean test(Product p) {
		return p.getPrice() >=100.0;
	}

}
