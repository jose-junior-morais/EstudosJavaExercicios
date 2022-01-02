package application.list;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		
		list.add("junior");
		list.add("fereira");
		list.add("bob");
		
		for(String x:list) {
			System.out.println("name= "+x);
		}
		System.out.println("------------");
	
		for(int i=0;i<list.size();i++) {
			System.out.println("indece= "+list.indexOf(list.get(i)));
		}		
		System.out.println("------------");
		
		list.remove(2);
		
		for(String x:list) {
			System.out.println("name= "+x);
		}		
		System.out.println("------------");
		
		for(int i=0;i<list.size();i++) {
			System.out.println("indece= "+list.indexOf(list.get(i)));
		}
		System.out.println("------------");
				
		list.removeIf(x->x.charAt(0)=='j');

		for(String x:list) {
			System.out.println("name= "+x);
		}
	}

}
