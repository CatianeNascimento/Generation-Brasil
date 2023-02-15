package LacosRepeticao02;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int idade, maior = 0, menor = 0;

		System.out.println("Digite sua idade: ");
		idade = input.nextInt();

		while (idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = input.nextInt();
			if (idade < 21) {
				menor++;
			}
			if (idade > 50) {
				maior++;
			}
		}
		System.out.println("A quantidade de pessoas menores de 21 anos é: " + menor);
		System.out.println("A quantidade de pessoas maiores de 50 anos é: " + maior);

	}

}
