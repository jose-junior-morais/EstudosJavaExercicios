package application.matrizes;

public class Program {

	public static void main(String[] args) {
		
		int [][] mat=new int[3][4];

		for(int l=0;l<3;l++) {
			for(int c=0;c<4;c++) {
				mat[l][c]=c;
			}
		}
		
		for(int l=0;l<mat.length;l++) {
			for(int c=0;c<4;c++) {
				System.out.print("    "+mat[l][c]);
			}
			System.out.println("\n");
		}
	}

}
