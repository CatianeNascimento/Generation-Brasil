package VetoresMatrizes;

import java.util.Scanner;

//Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
//Todos os elementos da Diagonal Principal
//Todos os elementos da Diagonal Secundária
//A Soma de todos os elementos da Diagonal Principal

public class EX03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[][] num = new int[3][3];
		int soma1, soma2;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um numero: ");
				num[linha][coluna] = input.nextInt();

			}
		}

		soma1 = num[0][0] + num[1][1] + num[2][2];
		soma2 = num[0][2] + num[1][1] + num[2][0];

		System.out.printf("Elementos da Diagonal Principal: %d %d %d", num[0][0], num[1][1], num[2][2]);
		System.out.printf("\nElementos da Diagonal Secundária: %d %d %d", num[0][2], num[1][1], num[2][0]);
		System.out.printf("\nSoma dos elementos da diagonal principal: %d", soma1);
		System.out.printf("\nSoma dos elementos da diagonal secundária: %d", soma2);

	}

}
