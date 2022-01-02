package application.vector;

public class Program {

	public static void main(String[] args) {
		
		int vectInt[]=new int[4];
		
		String vectString[]=new String[4];
		
		for(int i=0;i<vectInt.length;i++) {
			vectInt[i]=i;
			System.out.print(vectInt[i]+" ,");
		}
		
		System.out.println();
		System.out.println("--------------");
		
		for(int i=0;i<vectString.length;i++) {
			
			switch(i) {
			   case 0:{
				    vectString[i]="junior";
				    break;
			           }
			   case 1:{
				   vectString[i]="Maria";
				   break;
			   }
			   case 2:{
				   vectString[i]="Bob";
				   break;
			   }
			   default:{
				   vectString[i]="jj";
				   break;
			   }
				   
			    }
			System.out.print(vectString[i]+" ,");
		}

	}

}
