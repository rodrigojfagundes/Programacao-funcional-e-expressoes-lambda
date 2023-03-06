package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("tablet", 350.50));
		list.add(new Product("hd case", 80.90));
		

		//vamos aplicar a classe UPPERCASENAME em todos os produtos da LIST
		//para isso vamos usar o MAP... 		
		//A funcao MAP é uma funcao q aplica uma FUNCAO a todos elementos de uma STREAM
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//de FORMA CHIQUE... poderia ser de outro jeito
		//mas estamos acessando a LISTA NAMES e pecorrendo
		//e imprimindo os NOMES dos PRODUTOS q estao na lista
		names.forEach(System.out::println);
		
	}
}
