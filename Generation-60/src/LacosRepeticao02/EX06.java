package LacosRepeticao02;

import java.util.Scanner;

// Escrever um programa que receba v�rios n�meros inteiros no teclado. 
// E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0 (zero).

public class EX06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num, media = 0, soma = 0, cont = 0;

		do {
			System.out.println("Digite um n�mero:");
			num = input.nextInt();
			if (num % 3 == 0) {
				cont++;
				soma += num;
			}
		} while (num != 0);

		media = soma / (cont - 1);
		System.out.println("A m�dia dos multiplos de 3 �: " + media);
	}

}
