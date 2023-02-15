package LacosRepeticao;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.println("Digite o primeiro numero: ");
		n1 = input.nextInt();

		System.out.println("Digite o segundo numero: ");
		n2 = input.nextInt();

		if (n2 > n1) {
			for (int i = n1; i <= n2; i++) {
				if (n1 % 3 == 0 && n1 % 5 == 0) {
					System.out.println(n1 + " é multiplo de 3 e 5");
				}
				n1++;
			}
		} else {
			System.out.println("Intervalo inválido");
		}

	}
}
