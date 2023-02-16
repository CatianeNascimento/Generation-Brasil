package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EX01 {

	// Escreva um programa Java para criar uma Collection ArrayList de Objetos da
	// Classe String.
	// O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e
	// deverá adicioná-las
	// individualmente no ArrayList. Em seguida, faça o que se pede:
	// Mostre na tela todas as cores que foram adicionadas.
	// Mostre na tela todas as cores que foram adicionadas ordenadas em ordem
	// crescente.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		List <String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			String cor = input.nextLine();
			
			cores.add(cor);
		}
		
		System.out.println("As cores adicionadas são: ");
		System.out.println(cores);
		
		Collections.sort(cores);
		System.out.println("A cores adicionadas em ordem crescente: ");
       System.out.println(cores);
	}

}
