package application.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.comparator.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> prod=new ArrayList<>();
		
		prod.add(new Product("TV",900));
		prod.add(new Product("Radio",800));
		prod.add(new Product("Armario",1.900));
		prod.add(new Product("Carderno",900));
		
		Comparator<Product>comp=(p1,p2)->{
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};	
		
		prod.sort(comp);
		
		for(Product x:prod) {
			System.out.println(x.getName()+" - $"+x.getPrice());
		}

	}

}
