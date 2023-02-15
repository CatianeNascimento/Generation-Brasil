package VetoresMatrizes;

import java.util.Scanner;

// Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
// As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha 
// da matriz serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada
// participante e exiba as médias de cada um na tela.

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
			System.out.printf("\nA média do alune %d foi %.1f ", (linha + 1), media);
			media = 0;
		}
		
	

	}
}
