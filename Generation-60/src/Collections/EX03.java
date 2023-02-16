package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
// O programa dever� solicitar ao usu�rio, que ele digite via teclado 10 valores inteiros n�o repetidos e 
// adicione-os individualmente na Collection Set. Em seguida, fa�a o que se pede:
// Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
public class EX03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		int i = 0, num;

		while (i < 10) {
			System.out.println("Entre com um n�mero: ");
			num = input.nextInt();

			numeros.add(num);
			i++;
			System.out.println("------------");
		}

		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
