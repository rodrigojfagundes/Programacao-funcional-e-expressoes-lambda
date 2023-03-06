
package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	
	//metodo para o contrato da interface... O metodo q FAZ um TEST e retorna
	//VERDADEIRO ou FALSO
	@Override
	public boolean test(Product p) {
		//e vamos retornar APENAS o PRODUCT P q o PRIECE deles é MENOR q 100
		return p.getPrice() >=100.0;
	}

}
