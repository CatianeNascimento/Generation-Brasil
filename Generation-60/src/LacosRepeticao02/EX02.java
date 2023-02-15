package LacosRepeticao02;

import java.util.Scanner;

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

