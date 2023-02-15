package LacosRepeticao02;

import java.util.Scanner;

// Escrever um programa que receba vários números inteiros no teclado. 
// E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0 (zero).

public class EX06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num, media = 0, soma = 0, cont = 0;

		do {
			System.out.println("Digite um número:");
			num = input.nextInt();
			if (num % 3 == 0) {
				cont++;
				soma += num;
			}
		} while (num != 0);

		media = soma / (cont - 1);
		System.out.println("A média dos multiplos de 3 é: " + media);
	}

}
