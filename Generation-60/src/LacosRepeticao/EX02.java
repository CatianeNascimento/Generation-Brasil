package LacosRepeticao;

import java.util.Scanner;

// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

public class EX02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num, contP = 0, contI = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			num = input.nextInt();
			if(num % 2 == 0) {
				contP++;
			} else {
				contI++;
			}
		}
		System.out.println("Total de n�mero pares: " + contP);
		System.out.println("Total de n�mero �mpares: " + contI);
	}

}
