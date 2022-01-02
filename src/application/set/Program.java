package application.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<Integer> a=new TreeSet<>(Arrays.asList(1,2,3));
       System.out.println("a = "+a);
       
       Set<Integer> b=new TreeSet<>(Arrays.asList(4,5,3));
       System.out.println("b = "+b);
              
       a.addAll(b);
       System.out.println("uni�o de a e b ="+a);
       
       a.retainAll(b);
       System.out.println("Interse��o de a e b ="+a);
       
       a.removeAll(b);
       System.out.println("diferen�a de a e b ="+a);
       
	}

}
