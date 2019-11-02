package aplicaçao;

import java.util.Scanner;

import entidade.Cadastro;

public class Pensionato {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	    int n_quartos=9;
	    
		System.out.println("Infome a quantidade de alunos que irao alugar o quarto");	
		int n = ler.nextInt();
		Cadastro[] vetor = new Cadastro[n];
		
	    for(int i = 0;i<n;i++) {
		System.out.println("Infome o nome do aluno");	
		String nome = ler.next();
		System.out.println("Infome o numero do quarto");	
		int quarto = ler.nextInt();
		System.out.println("Infome o valor do aluguel");	
		double aluguel = ler.nextInt();
		System.out.println("Infome o email do aluno");	
		String email= ler.next();
	    vetor [i] = new Cadastro(quarto, aluguel, nome, email);	
	}

		
	    for(int i = 0;i<n_quartos;i++) {
	    	if(n<i) {
	    	    System.out.println("O quarto: "+vetor[i].getQuarto()+" esta vago");    		
	    	    }else {
		    	    System.out.println("Nome do aluno: "+vetor[i].getNome());
		    	    System.out.println("Email do aluno: "+vetor[i].getEmail());
		    	    System.out.println("Numero do quarto do aluno: "+vetor[i].getQuarto());
		    	    System.out.println("Aluguel do aluno: "+vetor[i].getAluguel());
	    	    }
	    			    	
	    	}
				
		
		

	}

}
