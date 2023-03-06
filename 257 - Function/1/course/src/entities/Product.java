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
	
	//criando um meetodo NAO STATIC, ele mexe diretamente com o PRIECE da classe
	public void nonstaticPriceUpdate() {
		//a variavel PRIECE recebe o valor de PRIECE com um aumento de 10%
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
}
