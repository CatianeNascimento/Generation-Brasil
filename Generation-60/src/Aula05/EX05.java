package Aula05;

import java.util.Scanner;

// Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
// No final, mostre a soma dos n�meros digitados.
public class EX05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = input.nextInt();
			
			soma += num;
			
		} while(num != 0);
		
		System.out.println("A soma dos n�meros �: " + soma);
	}

}
