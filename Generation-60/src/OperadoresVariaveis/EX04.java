package OperadoresVariaveis;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double a, b, c, d, r, s, somaR, somaS; 
		
		System.out.println("Insira 3 valores: ");
		System.out.println("VALOR A: ");
		a = input.nextDouble();
		System.out.println("VALOR B: ");
		b = input.nextDouble();
		System.out.println("VALOR C: ");
		c = input.nextDouble();
		
		somaR = a + b;
		somaS = b + c;
		
		r = Math.pow(somaR, 2);
		s = Math.pow(somaS, 2);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado do cálculo é: " + d);
		
	}

}
