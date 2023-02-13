package Aula05;

import java.util.Scanner;

// Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
// No final, mostre a soma dos números digitados.
public class EX05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			
			soma += num;
			
		} while(num != 0);
		
		System.out.println("A soma dos números é: " + soma);
	}

}
