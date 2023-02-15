package OperadoresVariaveis;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x1, x2, y1,y2, d, d1; 
		
		System.out.println("Digite o valor de x1: ");
		x1 = input.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		x2 = input.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = input.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = input.nextDouble();
		
		d1 = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
		d = Math.sqrt(d1);
		
		System.out.printf("A distância entre os pontos é de %.2f ", d);
		
	}

}
