//			PREDICATE
//Interface funcional PREDICATE
//interface GENERIC q contem APENAS um metodo ABSTRAT do tipo TEST,
//q recebe um valor do tipo T e retornar VERDADEIRO ou FALSO / BOOLEANO
//

package entities;

public class Product{
	
	private String name;
	private Double price;
	
	public Product() {
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >=100.0;
	}
	
	
	//criando um metodo NAO ESTATICO, q pega um produto e retorna um Booleano
	public boolean nonstaticProductPredicate() {
		//testando SE o valor da variavel PRICE e MENOR q 100
		return price >=100.0;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
