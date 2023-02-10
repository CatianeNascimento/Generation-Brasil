package Aula04;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		int idade, contMenor = 0, contMaior = 0;
		
		
		System.out.println("Digite a idade: ");
		idade = input.nextInt();
	
		while(idade > 0) {
			System.out.println("Digite a idade: ");
			idade = input.nextInt();
			if(idade < 21) {
				contMenor++;				
			} 
			if(idade > 50) {
				contMaior++;
			}
		} 
		
		System.out.println("Total de pessoas menores de 21: " + contMenor);
		System.out.println("Total de pessoas maiores de 50: " + contMaior);
	}

}
