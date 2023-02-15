package LacosRepeticao02;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int genero, idade, opcoes, cont = 0, pCalmas = 0, mNervosas = 0, hAgressivos = 0, pNervosas40 = 0, pCalmas18 = 0, oCalmos = 0; 
		
		while(cont < 150) {
			cont++;
			System.out.println("Qual sua idade? ");
			idade = input.nextInt();
			
			System.out.println("Qual seu genero?");
			System.out.println("1 - FEMININO");
			System.out.println("2 - MASCULINO");
			System.out.println("3 - OUTROS");
			genero = input.nextInt();
			
			System.out.println("Qual tipo de pessoa você se considera?");
			System.out.println("1 - CALMA");
			System.out.println("2 - NERVOSA");
			System.out.println("3 - AGRESSIVA");
			opcoes = input.nextInt();
			
			if(opcoes == 1) {
				pCalmas++;
			}
			if(genero == 1 && opcoes == 2) {
				mNervosas++;			
			}
			if(genero == 2 && opcoes == 3) {
				hAgressivos++;
			}
			if(genero == 3 && opcoes == 1) {
				oCalmos++;
			}
			if(idade > 40 && opcoes == 2) {
				pNervosas40++;
			}
			if(idade < 18 && opcoes == 1) {
				pCalmas18++;
			}
		}
		System.out.println("O número de pessoas calmas é: " + pCalmas);
		System.out.println("O número de mulheres nervosas é: " + mNervosas);
		System.out.println("O número de homens agressivos é: " + hAgressivos);
		System.out.println("O número de outros calmos é: " + oCalmos);
		System.out.println("O número de pessoas agressivas com mais de 40 anos é: " + pNervosas40);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + pCalmas18);
	}

}
