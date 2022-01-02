package application.estrutura.condicionais;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Character x=null;
		
		
		System.out.print("Executar estrutura if? s/n =");
		x=sc.next().charAt(0);
		   if(x=='s'|| x =='S') {
		System.out.println("bloco if executado");
		   }else {
			   System.out.println("If não executado");
		   }

		   System.out.print("Estrutura switch qual cor deseja? 1\\2\\3 (branco,vermelho,amarelo)=");
		   int num=sc.nextInt();
		   
		   switch(num) {
		   case 1:
			   System.out.println("Cor branca escolhida");
			   break;
		   case 2:
			   System.out.println("Cor vermelho escolhido");
			   break;
		   case 3:
			   System.out.println("Cor amarelo escolhido");
			   default :
				   System.out.println("nenhua cor escolhida");
		   }
		   
		   //espressão condicional ternária
		   
		   System.out.print("digite valor maior que 10 = ");
		   num=sc.nextInt();
		   
		   boolean boo= (num>10)? true:false;
		   
		   System.out.println(boo);
		
		sc.close();
	}

}
