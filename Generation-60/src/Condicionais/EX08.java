package Condicionais;

import java.util.Scanner;

public class EX08 {

	// Desenvolva um algoritmo em Java para uma conta banc�ria. O programa dever�
	// ler o tipo de opera��o a ser
	// realizada com base na tabela abaixo (n�mero inteiro entre 1 e 3) e o valor a
	// ser depositado ou sacado
	// (somente nas op��es 2 e 3). Considere que um saque s� pode ser realizado caso
	// haja saldo suficiente.
	// Ao final de cada opera��o, exiba o novo Saldo na tela. A vari�vel saldo
	// (float), ser� inicializada com
	// o valor de R$ 1000.00. Caso a opera��o seja diferente do intervalo 1 a 3,
	// mostre a mensagem Opera��o Inv�lida!

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int operacao;
		float valor = 100, saque, deposito, saldo;

		System.out.println("OPERA��ES: ");
		System.out.println("1 - SALDO");
		System.out.println("2 - SAQUE");
		System.out.println("3 - DEPOSITO");
		operacao = input.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("O saldo da conta � de: " + valor);
			break;
		case 2:
			System.out.println("Qual valor voc� deseja sacar? ");
			saque = input.nextFloat();
			if (valor > saque) {
				saldo = valor - saque;
				System.out.println("O novo saldo � de: " + saldo);
			} else {
				System.out.println("Saldo insuficiente para saque.\nO saldo dispon�vel � de: " + valor);
			}
			break;
		case 3:
			System.out.println("Qual valor do dep�sito? ");
			deposito = input.nextFloat();
			saldo = valor + deposito;
			System.out.println("O novo saldo � de: " + saldo);
			break;

		default:
			System.out.println("Opera��o inv�lida");
			break;
		}

	}
}
