package Aula01;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, n4, diferenca; 
		
	System.out.println("Entre com o primeiro valor: ");
	n1 = input.nextInt(); 
	
	System.out.println("Entre com o segundo valor: ");
	n2 = input.nextInt(); 
	
	System.out.println("Entre com o terceiro valor: ");
	n3 = input.nextInt(); 
	
	System.out.println("Entre com o quarto valor: ");
	n4 = input.nextInt(); 
	
	diferenca = (n1 * n2)  - (n3 * n4); 
	
	System.out.println("A diferença entre os valores inseridos é de: " + diferenca);

	}

}
