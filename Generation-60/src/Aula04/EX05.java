package Aula04;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		int num, soma = 0; 
		
		do {
			System.out.println("Entre com número: ");
			num = input.nextInt();
			if(num > 0) {
				soma += num;			
			}
		} while (num != 0);
		
		System.out.println("A soma dos números positivos é de: " + soma);
	}

}
