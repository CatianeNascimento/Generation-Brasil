package Aula02;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valorFabrica, pDistribuidor, impostos, valorFinal;
		
		System.out.println("Qual o valor de fábrica do carro: ");
		valorFabrica = input.nextDouble();
		
		pDistribuidor = valorFabrica * 0.28; 
		impostos = valorFabrica * 0.45; 
		
		valorFinal = valorFabrica + pDistribuidor + impostos; 
		
		System.out.println("O valor final do carro é: " + valorFinal);
		
	}

}
