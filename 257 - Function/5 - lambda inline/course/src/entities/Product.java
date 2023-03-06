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
	
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	//criando um metodo NAO ESTATICO como ele é NAO E ESTATICO, ELE NAO PRECISA RECEBER O
	//PRODUCT P... Pois ele ja trabalha com o propio name, price, etc... da classe
	//um valor de STRING... q é o nome do PRODUCT em letra MAIUSCULA
	public String nonstaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
}
