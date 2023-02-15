package VetoresMatrizes;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num[] = new int[10];
		int par[] = new int[10];
		int impar[] = new int[10];
		int i, j, k, soma = 0, media = 0;
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite um número:");
			num[i] = input.nextInt();

			soma += num[i];

			if (num[i] % 2 == 0) {
				par[i] = num[i];
			} else {
				impar[i] = num[i];
			}
		}
		for (j = 0; j < 10; j++) {
			if (par[j] != 0) {
				System.out.println("Os números pares são: " + par[j]);
			}
		}

		for (k = 0; k < 10; k++) {
			if (impar[k] != 0) {
				System.out.println("Os números impares são: " + impar[k]);
			}
		}
		
		media = soma / 10;
		System.out.println("A soma de todos os números é: " + soma);
		System.out.println("A média dos números é: " + media);
	}
}
