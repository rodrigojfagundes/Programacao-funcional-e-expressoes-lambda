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
	
	//criando um metodo ESTATICO q RECEBE um PRODUTO P como argumento, e q retorna
	//um valor de STRING... q é o nome do PRODUCT em letra MAIUSCULA
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
}
