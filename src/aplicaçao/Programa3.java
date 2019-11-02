package aplicaçao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Empregado;

public class Programa3 {

	public static void main(String[] args) {
		List<Empregado> lista = new ArrayList<>();
        String resposta ="sim";
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o numero de funcionarios");
		int n = ler.nextInt();
		
		while(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")) {
			for(int i = 0;i<n;i++) {
				System.out.println("informe o nome do funcionario");
				String nome = ler.next();
				System.out.println("informe a ID do funcionario");
				Integer id = ler.nextInt();
				System.out.println("informe o salario funcionario");
				Double salario = ler.nextDouble();
				lista.add(new Empregado(nome, id, salario));
			}
			
			 System.out.println("Informe qual funcionario que vc deseja aumentar o salario");
			 Integer id = ler.nextInt();
	         Empregado emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	         
	         if(emp == null) {
	        	 System.out.println("Funcionario nao encontrado");
	         }else{
		        	 System.out.println("informe o valor a ser incrementado");
		        	 Double aumento = ler.nextDouble();
		        	emp.addSalario(aumento);
	        	 }	

	         }
	         
	         System.out.println("Lista de funcionarios");
	         for (Empregado x :lista) {
	        	 System.out.println(x);
	        	 
	        	 System.out.println("Deseja continuar? [sim/nao]");
	        	 resposta = ler.next();
	         }
	        
			
		}
		
         
		
		
	}


