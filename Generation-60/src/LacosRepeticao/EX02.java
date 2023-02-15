package LacosRepeticao;

import java.util.Scanner;

// Ler 10 números e imprimir quantos são pares e quantos são ímpares.

public class EX02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num, contP = 0, contI = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			if(num % 2 == 0) {
				contP++;
			} else {
				contI++;
			}
		}
		System.out.println("Total de número pares: " + contP);
		System.out.println("Total de número ímpares: " + contI);
	}

}
