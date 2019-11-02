package aplicaçao;

import java.util.Scanner;

import entidade.Produto;

public class Programa2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		

	int	n = ler.nextInt();
				
		Produto[] vetor = new Produto[n];
		
		for (int i= 0; i< n;i++) {
			
			System.out.println("Informe o nome do produto");
		    String nome= ler.next();
		    System.out.println("informe o valor do produto");
		    double preço = ler.nextDouble();
		    vetor[i] = new Produto(nome, preço);
		}
        
		
		for(int i =0;i <n;i++) {
			System.out.println(vetor[i] );
		}
		
		double soma = 0;
		for(int i =0; i <n;i++) {
			soma += vetor[i].getPreço();			
		}
		
	   double media = soma / n;

	   System.out.println("Media dos produtos é :"+media);
	}


}
