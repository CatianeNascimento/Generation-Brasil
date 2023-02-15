package VetoresMatrizes;

import java.util.Scanner;

// Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
// As 4 notas de cada participante ser�o armazenadas em uma linha de uma matriz de n�meros reais, logo cada linha 
// da matriz ser�o as notas de um participante. Em um vetor de n�meros reais, armazene as m�dias de cada
// participante e exiba as m�dias de cada um na tela.

public class EX04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float[][] notas = new float[10][4];
		float media = 0;
		float[] vetorMedia = new float[10];

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {

				System.out.println("\nDigite a nota do alune: ");
				notas[linha][coluna] = input.nextFloat();

				media += (notas[linha][coluna]) / 4;

			}
			vetorMedia[linha] = media;
			System.out.printf("\nA m�dia do alune %d foi %.1f ", (linha + 1), media);
			media = 0;
		}
		
	

	}
}
