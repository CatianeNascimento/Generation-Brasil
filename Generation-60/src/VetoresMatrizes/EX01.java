package VetoresMatrizes;

import java.util.Scanner;

public class EX01 {

	// Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
	// construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
	// irá digitar um número e o programa deve exibir na tela a posição deste número
	// no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
	// encontrado!” deve ser exibida na tela.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] num = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int n;;

		System.out.println("Digite o numero que deseja encontrar: ");
		n = input.nextInt();

		for (int i = 0; i < 10; i++) {
			if (num[i] == n) {
				System.out.println("O número " + n + " está localizado na posição " + i);

			}
		}
	}

}
