package Condicionais;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float n1, n2, resultado;
		int operacao;

		System.out.println("Digite o primeiro valor: ");
		n1 = input.nextFloat();

		System.out.println("Digite o segundo valor: ");
		n2 = input.nextFloat();

		System.out.println("Qual opera��o voc� deseja fazer: ");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRA��O");
		System.out.println("3 - MULTIPLICA��O");
		System.out.println("4 - DIVIS�O");
		operacao = input.nextInt();

		switch (operacao) {
		
		 case 1: 
			 resultado = n1 + n2;
			 System.out.println("A soma dos n�meros digitados �: " + resultado);
			 break;
			 
		 case 2: 
			 resultado = n1 - n2;
			 System.out.println("A subtra��o dos n�meros digitados �: " + resultado);
			 break;
			 
		 case 3: 
			 resultado = n1 * n2;
			 System.out.println("A multiplica��o dos n�meros digitados �: " + resultado);
			 break;
			 
		 case 4: 
			 resultado = n1 / n2;
			 System.out.println("A divis�o dos n�meros digitados �: " + resultado);
			 break;
			 
			 default: 
				 System.out.println("Opera��o Inv�lida");
		}
	}

}
