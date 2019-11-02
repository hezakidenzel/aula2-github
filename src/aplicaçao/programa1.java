package aplicaçao;

import java.util.Scanner;

public class programa1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        
		int n = ler.nextInt();
		double [] vetor = new double [n];
		
		for (int i = 0;i<n;i++) {
			vetor [i] = ler.nextDouble();	
		}
		
		for(int i = 0; i< n;i++) {
			System.out.println(vetor[i]);;
		}

		ler.close();
	}

}
