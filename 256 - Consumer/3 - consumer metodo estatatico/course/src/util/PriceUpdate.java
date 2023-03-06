//interface funcional CONSUMER
//q é parametrizada no tipo T, e ela tem um unico metodo abstrato q é o ACCEPT
//q é um void... Executa uma acao e nao retorna nada
package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
