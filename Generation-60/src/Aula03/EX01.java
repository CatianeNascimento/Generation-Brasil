package Aula03;

import java.util.Scanner;

public class EX01 {

	// Fa�a um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na 
	//tela se a soma de A + B � maior, menor ou igual a C. 
	
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = input.nextInt();

		System.out.println("Digite o valor de B: ");
		b = input.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = input.nextInt();
		
		if(a + b > c) {
			System.out.println("O valor da soma de A e B � maior ao valor de C");
		} else if (a + b < c) {
			System.out.println("O valor da soma de A e B � menor ao valor de C");
		} else {
			System.out.println("O valor da soma de A e B � igual ao valor de C");
		}
	}

}
