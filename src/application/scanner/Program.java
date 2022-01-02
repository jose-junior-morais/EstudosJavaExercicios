package application.scanner;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//scanner utilizado para receber dados
		Scanner sc=new Scanner(System.in);
		
		System.out.print("adicione um inteiro = ");
		int value=sc.nextInt();
		
		System.out.println("Seu valor digitado = "+value);	
		
		
		//----------------------------------------------
		System.out.print("Digite o valor decimal = ");
		double decimal=sc.nextDouble();
		
		System.out.println("Seu valor decimal = "+String.format("%f", decimal));
		
		//para tranformar a vigula do decimal em ponto 
		Locale.setDefault(Locale.US);
		
		System.out.println("Seu valor decimal = "+String.format("%f", decimal));
		
		//pegando a primeira letra
		System.out.print("Digite uma palavra = ");
		char x=sc.next().charAt(0);
		System.out.println("Primeira letra da palavra digitada = "+x);
		
sc.close();
	}

}
