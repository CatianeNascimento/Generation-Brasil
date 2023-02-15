package Condicionais;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String palavra1, palavra2, palavra3;

		System.out.println("Insira a primeira palavra: ");
		palavra1 = input.nextLine();

		System.out.println("Insira a segunda palavra: ");
		palavra2 = input.nextLine();

		System.out.println("Insira a terceira palavra: ");
		palavra3 = input.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("ÁGUIA");
				} else if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("POMBA");
				}

			} else if (palavra2.equalsIgnoreCase("mamifero")) {
				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("HOMEM");
				} else if (palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("VACA");
				}
			}

		} else if (palavra1.equalsIgnoreCase("ivertebrado")) {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("PULGA");
				} else if (palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("LARGATA");
				}
			} else if (palavra2.equalsIgnoreCase("anelideo")) {
				if (palavra3.equalsIgnoreCase("hematafogo")) {
					System.out.println("SANGUESSUGA");
				} else if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("MINHOCA");
				}
			}

		}
	}

}