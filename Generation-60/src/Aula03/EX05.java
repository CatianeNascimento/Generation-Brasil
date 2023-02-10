package Aula03;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int codigo, qntItem, valor;

		System.out.println("TABELA PRODUTOS: ");
		System.out.println("1 - CACHORRO QUENTE R$10,00");
		System.out.println("2 - X-SALADA R$15,00");
		System.out.println("3 - X-BACON R$18,00");
		System.out.println("4 - BAURU R$12,00");
		System.out.println("5 - REFRIGERANTE R$8,00");
		System.out.println("6 - SUCO DE LARANJA R$13,00");

		System.out.println("Digite o código do produto que você deseja: ");
		codigo = input.nextInt();

		System.out.println("Qual a quantidade deste item? ");
		qntItem = input.nextInt();

		switch (codigo) {
		case 1:
			valor = qntItem * 10;
			System.out.println("1 - CACHORRO QUENTE R$10,00");
			System.out.println("O valor da compra é de R$: " + valor);
		case 2:
			valor = qntItem * 15;
			System.out.println("2 - X-SALADA R$15,00");
			System.out.println("O valor da compra é de R$:: " + valor);

		case 3:
			valor = qntItem * 18;
			System.out.println("3 - X-BACON R$18,00");
			System.out.println("O valor da compra é de R$:: " + valor);

		case 4:
			valor = qntItem * 12;
			System.out.println("4 - BAURU R$12,00");
			System.out.println("O valor da compra é de R$:: " + valor);

		case 5:
			valor = qntItem * 8;
			System.out.println("5 - REFRIGERANTE R$8,00");
			System.out.println("O valor da compra é de R$: " + valor);

		case 6:
			valor = qntItem * 13;
			System.out.println("6 - SUCO DE LARANJA R$13,00");
			System.out.println("O valor da compra é de R$: " + valor);

		}

	}
}
