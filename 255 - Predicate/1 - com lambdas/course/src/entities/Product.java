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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}	
}
