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
			System.out.println("Digite um n�mero:");
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
				System.out.println("Os n�meros pares s�o: " + par[j]);
			}
		}

		for (k = 0; k < 10; k++) {
			if (impar[k] != 0) {
				System.out.println("Os n�meros impares s�o: " + impar[k]);
			}
		}
		
		media = soma / 10;
		System.out.println("A soma de todos os n�meros �: " + soma);
		System.out.println("A m�dia dos n�meros �: " + media);
	}
}
