package Aula03;

import java.util.Scanner;

        //Escreva um algoritmo em Java, que leia um n�mero inteiro via teclado 
		// e mostre na tela uma mensagem indicando se este n�mero � par ou �mpar e 
		//se o n�mero � positivo ou negativo
public class EX02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		int num;
		
		System.out.println("DIGITE UM N�MERO: ");
		num = input.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.println("O n�mero " + num + " � par e positivo");
		} else if (num % 2 == 0 && num < 0) {
			System.out.println("O n�mero " + num + " � par e negativo");
		} else if (num % 2 != 0 && num > 0) {
			System.out.println("O n�mero " + num + " � �mpar e positivo");
		} else {
			System.out.println("O n�mero " + num + " � �mpar e negativo");

		}
		
		
	}

}
