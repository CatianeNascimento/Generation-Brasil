package VetoresMatrizes;

import java.util.Scanner;

public class EX01 {

	// Dado um vetor contendo 10 n�meros inteiros n�o ordenados e n�o repetidos,
	// construa um algoritmo que consiga pesquisar dados no vetor, onde o usu�rio
	// ir� digitar um n�mero e o programa deve exibir na tela a posi��o deste n�mero
	// no vetor. Caso o n�mero n�o seja encontrado, a mensagem: �N�o foi
	// encontrado!� deve ser exibida na tela.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] num = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int n;;

		System.out.println("Digite o numero que deseja encontrar: ");
		n = input.nextInt();

		for (int i = 0; i < 10; i++) {
			if (num[i] == n) {
				System.out.println("O n�mero " + n + " est� localizado na posi��o " + i);

			}
		}
	}

}
