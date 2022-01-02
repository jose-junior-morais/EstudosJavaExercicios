package application.file2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] line=new String[3];
		for(int i=0;i<line.length;i++) {
			System.out.print("Digite a palavra a ser acrescentada no arq: ");
			line[i]=sc.nextLine();
		}
		System.out.print("passe o caminho: ");
		String path=sc.nextLine()+"\\file.txt";
try(BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
	
	for(String x:line) {
		bw.write(x);
		bw.newLine();
	}
	
	
}catch(IOException e) {
	System.out.println(e.getMessage());
}finally {
	sc.close();
}
	}

}
