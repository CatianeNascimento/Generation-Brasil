package Aula03;

import java.util.Scanner;

        //Escreva um algoritmo em Java, que leia um número inteiro via teclado 
		// e mostre na tela uma mensagem indicando se este número é par ou ímpar e 
		//se o número é positivo ou negativo
public class EX02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		int num;
		
		System.out.println("DIGITE UM NÚMERO: ");
		num = input.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.println("O número " + num + " é par e positivo");
		} else if (num % 2 == 0 && num < 0) {
			System.out.println("O número " + num + " é par e negativo");
		} else if (num % 2 != 0 && num > 0) {
			System.out.println("O número " + num + " é ímpar e positivo");
		} else {
			System.out.println("O número " + num + " é ímpar e negativo");

		}
		
		
	}

}
