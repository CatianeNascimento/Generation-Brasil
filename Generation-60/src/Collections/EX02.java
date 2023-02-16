package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer,
// inicializada com 10 valores inteiros. O programa dever� solicitar ao usu�rio, que ele digite via teclado
// 1 n�mero inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posi��o deste n�mero na Collection
public class EX02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<Integer>();

		Integer num;

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite um n�mero: ");
		num = input.nextInt();

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == num) {
				System.out.println("O n�mero " + num + " est� na posi��o " + i);
			} else {
				System.out.println(" N�mero n�o encontrado");

			}

		}

	}
}
